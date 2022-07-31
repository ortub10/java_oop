package lesson3.drill3;

public class Water implements Recycling {

    @Override
    public void recycle() {
        System.out.println("The sewage water is now clean for irrigation");
    }

    public void rain(){
        System.out.println("The rain is water");
    }
}
