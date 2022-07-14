package lesson2.drill1;

public class testMain {
    public static void main(String[] args) {

        Car[]cars = new Car[5];
        cars[0] = new Car(20000,"Toyota",500);
        cars[1] = new Car(30000,"Mazda",600);
        cars[2] = new ElectricCar(400000,"Tesla",1000,120,4000,2000);
        cars[3] = new ElectricCar(600000,"Google",900,120,7000,3000);
        cars[4] = new ElectricCar(700000,"Elbit",800,120,8000,4000);

        for (Car c: cars){
            if (c instanceof ElectricCar) {
                ((ElectricCar) c).charge();
                c.print();
                System.out.println();
            }
        }
    }
}
