package lesson4.drill5;

import java.util.Objects;

public class Car{
   private String type;
    private String color;

    public Car(String type, String color) {
        this.type = type;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(!(obj instanceof Car)) return false;
        Car c = (Car)obj;
        return (this.type.equals(c.type)&&this.color.equals(this.color));
    }


    @Override
    public int hashCode() {
        return Objects.hash(type, color);
    }

    @Override
    public String toString() {
        return "car{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
