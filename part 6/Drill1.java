package lesson6;

public class Drill1 {
    public static void main(String[] args) {

       new MyCounterThread("first").start();
       new MyCounterThread("second").start();
    }
}
class MyCounterThread extends Thread{

    public MyCounterThread(String name){
       super(name);
    }
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
}
