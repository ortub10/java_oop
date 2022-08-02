package lesson3.drill4;

public class Leopard extends Animal implements Breastfeeding{

    public void family(){
        System.out.println("Belongs to the cat family");
    }

    @Override
    public void breastfeeding() {
        System.out.println("The Leopard is mammal");
    }

    @Override
    public void move() {
        System.out.println("The leopard move fast");
    }
}
