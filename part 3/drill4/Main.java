package lesson3.drill4;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Leopard();
        animals[2] = new Pelican();

        for(Animal animal: animals){
            animal.move();
            if (animal instanceof  Breastfeeding)
                ((Breastfeeding) animal).breastfeeding();
            else if (animal instanceof  LayingEggs)
                ((LayingEggs) animal).layingEggs();
            System.out.println("------------------------");
        }
    }


}
