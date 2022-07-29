package lesson3.drill2;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void area();

    public abstract void Scope();

    @Override
    public  String toString() {
        return "Shape{" +
                "name=" + name +
                '}';
    }
}
