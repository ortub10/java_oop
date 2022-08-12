package lesson6;

public class Drill6 {
    public static int numOfTicket = 100;
   static final Object handle = new Object();
    public static void main(String[] args) {
      Order t1 = new Order("yesPlanet");
      Order t2 = new Order("HotCinema");
      t1.start();
      t2.start();
    }
}
class Order extends Thread{
    public Order(String name) {
        super(name);
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i<20; i++){
            int tickWant = (int)((Math.random()*9)+1);
            synchronized (Drill6.handle) {
            if (tickWant<=Drill6.numOfTicket) {

                    System.out.println("Before buy there are: " + Drill6.numOfTicket + " from: " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Drill6.numOfTicket -= tickWant;
                    System.out.println("After buy there are: " + Drill6.numOfTicket + " from: " + Thread.currentThread().getName());

                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}