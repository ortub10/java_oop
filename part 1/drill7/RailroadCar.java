package lesson1.drill7;

public class RailroadCar {
    private int area;
    private int maxPassengers;
    private int currentPassengers;

    public RailroadCar(int area, int maxPassengers){
        this.area = area;
        this.maxPassengers = maxPassengers;
        this.currentPassengers = 0;
    }

    public RailroadCar(int area, int maxPassengers, int currentPassengers){
        this.area = area;
        this.maxPassengers = maxPassengers;
        this.currentPassengers = currentPassengers;
    }
    public RailroadCar(RailroadCar other){
        this(other.area,other.maxPassengers,other.currentPassengers);
    }

    public int getArea(){
        return this.area;
    }
    public int getMaxPassengers(){
        return this.maxPassengers;
    }
    public int getCurrentPassengers(){
        return this.currentPassengers;
    }

    public void setArea(int area){
        if (area>0)
            this.area = area;
    }
    public void setMaxPassengers(int maxPassengers){
        if (maxPassengers>0)
            this.maxPassengers = maxPassengers;
    }

    public void setCurrentPassengers(int currentPassengers){
        if (currentPassengers>0 && currentPassengers<this.maxPassengers)
            this.currentPassengers = currentPassengers;
    }

    public boolean hasSpace(int amount){
        return amount<=(maxPassengers-currentPassengers);
    }

    public boolean addPassengers(int amount){
        if (hasSpace(amount)){
            this.currentPassengers+=amount;
            return true;
        }
        return false;
    }

    public void print(){
        System.out.println("area: "+area+", max place: "+maxPassengers+", current passengers: "+currentPassengers);

    }
}
