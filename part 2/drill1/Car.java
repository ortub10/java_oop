package lesson2.drill1;

public class Car {
    private int price;
    private String kind;
    private int volume;

    public Car(int price, String kind, int nefah) {
        this.price = price;
        this.kind = kind;
        this.volume = nefah;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void print() {
        System.out.println(
                "price=" + price +
                ", kind='" + kind + '\'' +
                ", volume=" + volume);
    }
}
