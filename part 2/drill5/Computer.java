package lesson2.drill5;

import lesson2.drill4.Name;

public class Computer {

    private int price;
    private String operatingSystem;
    private int memory;
    private double screenLen;

    public Computer(int price, String operatingSystem, int memory, double screenLen) {
        this.price = price;
        this.operatingSystem = operatingSystem;
        this.memory = memory;
        this.screenLen = screenLen;
    }

    public Computer(Computer other){
        this(other.price, other.operatingSystem,other.memory,other.screenLen);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getScreenLen() {
        return screenLen;
    }

    public void setScreenLen(double screenLen) {
        this.screenLen = screenLen;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(!(obj instanceof Computer)) return false;
        Computer computer = (Computer)obj;
        return this.operatingSystem.equals(computer.operatingSystem) &&
                this.memory == computer.memory && this.screenLen == computer.screenLen;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", operatingSystem=" + operatingSystem +
                ", memory=" + memory +
                ", screenLen=" + screenLen +
                '}';
    }
}
