package lesson3.drill4;

public class Pelican extends Animal implements LayingEggs{

    public void home(){
        System.out.println("The pelican living in water");
    }

    @Override
    public void layingEggs() {
        System.out.println("The Pelican laying eggs");
    }

    @Override
    public void move() {
        System.out.println("The pelican move slowly");
    }
}
