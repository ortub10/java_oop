package lesson3.drill2;

public class Circle extends Shape{
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("Area "+ this.getName()+": "+ Math.PI*Math.pow(radius,2));
    }

    @Override
    public void Scope() {
        System.out.println("Scope "+ this.getName()+": "+ 2*Math.PI*radius);
    }
}
