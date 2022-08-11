package lesson6;

public class Drill3 {
    public static void main(String[] args) {
        new Thread(new Something(),"first").start();
        new Thread(new Something(),"second").start();
    }
}
class Something implements Runnable{
    @Override
    public void run() {
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