package lesson3.drill4;

public class Dog extends Animal implements Breastfeeding{

    public void voice(){
        System.out.println("Ave ave");
    }

    @Override
    public void breastfeeding() {
        System.out.println("The dog is mammal");
    }

    @Override
    public void move() {
        System.out.println("The dog move regular");
    }
}
