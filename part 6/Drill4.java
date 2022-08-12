package lesson6;

public class Drill4 {
    public static void main(String[] args) {
        Count t1 = new Count(1,10,"1-10",1000);
        Count t2 = new Count(11,20,"11-20 damon",2000);
        Count t3 = new Count(21,30,"21-30",1000);
        t2.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}
class Count extends Thread{
  private int start;
   private int end;
   private int sleep;

    public Count(int start, int end, String name, int sleep) {
        super(name);
        this.start = start;
        this.end = end;
        this.sleep = sleep;

    }

    @Override
    public void run() {
        for (int i = this.start; i<=this.end; i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            try {
                Thread.sleep(this.sleep);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}