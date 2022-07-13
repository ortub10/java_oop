package lesson1.drill7;

public class TrainMain {
    public static void main(String[] args) {
        RailroadCar r1 = new RailroadCar(5,50,20);
        RailroadCar r2 = new RailroadCar(5,60,25);
        RailroadCar r3 = new RailroadCar(5,50,40);
        RailroadCar r4 = new RailroadCar(5,45,30);
        RailroadCar r5 = new RailroadCar(5,40,10);

        Train train = new Train(200,"Shlomo");
        train.addCar(r1);
        train.addCar(r2);
        train.addCar(r3);
        train.addCar(r4);
        train.addCar(r5);
        System.out.println("first:");
        train.print();
        train.addPassengers(10);
        System.out.println("second:");
        train.print();
        RailroadCar[] place = train.freeCars(30);
        System.out.println("third:");
        for (RailroadCar car: place)
            car.print();
        System.out.println("---------------");
        train.print();
        RailroadCar[] place1 = train.freeCars(30);
        System.out.println("forth:");
        for (RailroadCar car: place1)
            car.print();
        System.out.println("---------------");
        train.print();
        train.addPassengers(10);
        System.out.println("fifth:");
        train.print();
        train.maxPassengers().print();
    }
}
