package lesson6;

public class Drill5 {
    public static void main(String[] args) {

        Greeting greeting1 = new Greeting("SayHello","Hello");
        Greeting greeting2 = new Greeting("SayWelcome","Welcome");
        greeting1.start();
        greeting2.start();

        try {
            greeting1.join();
            greeting2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i<5; i++){

            System.out.println(Thread.currentThread().getName()+": Goodbye");
            try {

                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
 class Greeting extends Thread{
    private String greeting;
     public Greeting(String name , String greeting) {
         super(name);
         this.greeting = greeting;
     }

     @Override
     public void run() {
         super.run();
         for (int i = 0; i<5; i++) {
             System.out.println(Thread.currentThread().getName()+": "+greeting);
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }

     }
 }