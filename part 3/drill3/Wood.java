package lesson3.drill3;

public class Wood implements Recycling {

    @Override
    public void recycle() {
        System.out.println("The wood now is shelf");
    }

    public void cut(){
        System.out.println("We cut the wood");
    }
}
