package lesson3.drill3;

public class Pants implements Recycling {

    @Override
    public void recycle() {
        System.out.println("The pants are cut into pieces and used for cleaning");
    }

    public void wearing(){
        System.out.println("We wear pants");
    }
}
