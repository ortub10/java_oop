package lesson6;

public class Drill2 {
    public static void main(String[] args) {
        new Thread("First"){
            @Override
            public void run() {
                super.run();
                for (int i = 1; i<=10; i++){
                    System.out.println(Thread.currentThread().getName()+":"+i);
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new Thread("second"){
            @Override
            public void run() {
                super.run();
                for (int i = 1; i<=10; i++){
                    System.out.println(Thread.currentThread().getName()+":"+i);
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}
