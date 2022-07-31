package lesson3.drill3;

public class RecyclingMain {
    public static void main(String[] args) {

        Recycling [] recycles = new Recycling[5];
        recycles[0] = new Wood();
        recycles[1] = new Bottle();
        recycles[2] = new Water();
        recycles[3] = new Pants();
        recycles[4] = new Recycling() {
            @Override
            public void recycle() {
                System.out.println("Recycle is important");
            }
        };

        for (Recycling recycling: recycles){
            recycling.recycle();
            if (recycling instanceof Wood)
                ((Wood) recycling).cut();
            else if (recycling instanceof Bottle)
                ((Bottle)recycling).drink();
            else if (recycling instanceof Water)
                ((Water)recycling).rain();
            else if (recycling instanceof Pants)
                ((Pants)recycling).wearing();
            System.out.println("------------------");
        }
    }
}
