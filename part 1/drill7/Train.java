package lesson1.drill7;

public class Train {
    private int maxSpeed;
    private String nameDriver;
    private RailroadCar[] railroadCars;
    private int numOfRailroadCars;

    public Train(int maxSpeed,String nameDriver){
        this.maxSpeed = maxSpeed;
        this.nameDriver = nameDriver;
        railroadCars = new RailroadCar[10];
        numOfRailroadCars = 0;
    }

    public int getMaxSpeed(){
        return this.maxSpeed;
    }

    public String getNameDriver(){
        return this.nameDriver;
    }

    public void setMaxSpeed(int maxSpeed){
        if (maxSpeed>0)
            this.maxSpeed = maxSpeed;
    }

    public void setNameDriver(String nameDriver){
        this.nameDriver = nameDriver;
    }

    public boolean addCar(RailroadCar car){
        if (numOfRailroadCars<railroadCars.length){
            railroadCars[numOfRailroadCars++] = new RailroadCar(car);
            return true;
        }
        return false;
    }

    public boolean addCar(int area, int passengers){
       RailroadCar car = new RailroadCar(area,passengers);
       return addCar(car);
    }

    public int numOfPassengers(){
        int sum = 0;
        for (int i = 0; i<numOfRailroadCars; i++){
            sum+=railroadCars[i].getCurrentPassengers();
        }
        return sum;
    }
    public RailroadCar maxPassengers(){
        int index = 0;
        for (int i = 1; i<numOfRailroadCars; i++){
            if (railroadCars[i].getCurrentPassengers()>railroadCars[index].getCurrentPassengers())
                index = i;
        }
        return new RailroadCar(railroadCars[index]);
    }

    // Add passengers and return number of railroad car
    public int addPassengers(int amount){
        for (int i = 0; i<railroadCars.length; i++){
            if (railroadCars[i].addPassengers(amount))
                return i+1;
        }
        return 0;
    }
    public RailroadCar[] freeCars(int amount){
        int [] numOfRailroadCars = new int[10];
        int index = 0;
        for (int i = 0; i<railroadCars.length; i++){
            if (railroadCars[i].hasSpace(amount))
                numOfRailroadCars[index++] = i;
        }

        RailroadCar[] place = new RailroadCar[index];
        for (int i = 0; i<place.length; i++){
            place[i] = new RailroadCar(railroadCars[numOfRailroadCars[i]]);
        }

        return place;
    }

    public void print(){
        System.out.println("driver: "+this.nameDriver+", num of railroad cars: "+this.numOfRailroadCars);
        for (int i = 0; i<numOfRailroadCars; i++)
            railroadCars[i].print();
    }
}
