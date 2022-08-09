package lesson4.drill5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Car,Driver> carsDrivers = new HashMap<>();

        carsDrivers.put(new Car("Honda","Gray"),new Driver("Mohse",20));
        carsDrivers.put(new Car("Mazda 3","Silver"),new Driver("Mohse",20));
        carsDrivers.put(new Car("Toyota","White"),new Driver("Dave",10));
        carsDrivers.put(new Car("Honda","Gray"),new Driver("Yael",25));
        carsDrivers.put(new Car("Porsche","Red"),new Driver("Ravit",15));
        carsDrivers.put(new Car("Kia","Brown"),new Driver("Bili",15));


        Collection<Driver> drivers = carsDrivers.values();
        ArrayList<Driver> driverArrayList = new ArrayList<>(drivers);
        System.out.println("Driver list before sorting:");
        System.out.println(driverArrayList);
        Collections.sort(driverArrayList,new DriverSortingComparator());
        System.out.println("Driver list after sorting:");
        System.out.println(driverArrayList);

    }
}
