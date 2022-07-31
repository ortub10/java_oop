package lesson3.drill3;

public class Bottle implements Recycling {
    @Override
    public void recycle() {
        System.out.println("The bottle fulling in new drink ");
    }

    public void drink(){
        System.out.println("We drink from the bottle ");
    }
}
