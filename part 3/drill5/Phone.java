package lesson3.drill5;

public class Phone implements Comparable<Phone>{
   private int memory;
    private String type;
    private int price;
    private int batteryLife;

    public Phone(int memory, String type, int price, int batteryLife) {
        this.memory = memory;
        this.type = type;
        this.price = price;
        this.batteryLife = batteryLife;
    }

    @Override
    public int compareTo(Phone o) {
        if (this.memory>o.memory) return 1;
        else if (this.memory<o.memory) return -1;
        else {
            if (this.price>o.price) return 1;
            else if (this.price<o.price)return -1;
            else {
                if (this.batteryLife >o.batteryLife) return 1;
                else if (this.batteryLife <o.batteryLife) return -1;
                else return this.type.compareTo(o.type);
            }

        }

    }

    @Override
    public String toString() {
        return "{" +
                "memory=" + memory +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", batteryLife=" + batteryLife +
                '}';
    }
}
