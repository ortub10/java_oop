package lesson3.drill2;

public class Rectangle extends  Shape {

    private double lineA;
    private double lineB;


    public Rectangle(String name, double lineA, double lineB) {
        super(name);
        this.lineA = lineA;
        this.lineB = lineB;
    }

    @Override
    public void area() {
        System.out.println("Area "+ this.getName()+": "+ lineA * lineB);
    }

    @Override
    public void Scope() {
        System.out.println("Scope "+ this.getName()+": " + lineA * 2 + lineB * 2);
    }

}
