package lesson6;

public class Drill7 {
    public static void main(String[] args) {
        Object times3 = new Object();
        Object times5 = new Object();
        new Moshe(times3,times5).start();
        new David(times3,times5).start();
    }
}

class Moshe extends Thread{
    final Object times3;
    final Object times5;

    public Moshe(Object times3, Object times5) {
        this.times3 = times3;
        this.times5 = times5;
    }

    @Override
    public void run() {
        super.run();
      for (int i= 1; i<=5; i++){
          System.out.println("דויד!");
          if (i==3){
              synchronized (this.times3){
                  this.times3.notify();
              }
          }

          try {
              Thread.sleep(500);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }

      }
            synchronized (this.times5){
                try {
                    this.times5.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        for (int i= 1; i<=5; i++){
            System.out.println("בוא אני לא שומע אותך");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class David extends Thread{
    final Object times3;
    final Object times5;

    public David(Object times3, Object times5) {
        this.times3 = times3;
        this.times5 = times5;
    }

    @Override
    public void run() {
        super.run();
        synchronized (this.times3){

            try {
                this.times3.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        for (int i= 1; i<=8; i++){
            System.out.println("כן, אני כאן");

            if (i==5){
                synchronized (this.times5){
                    this.times5.notify();
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}