package lesson3.drill2;

public class Triangle extends Shape {

    private double lineA;
    private double lineB;
    private double lineC;

    public Triangle(String name, double lineA, double lineB, double lineC) {
        super(name);
        this.lineA = lineA;
        this.lineB = lineB;
        this.lineC = lineC;
    }

    @Override
    public void area() {//Heron's formula

        double firstCalculation = lineA + lineB + lineC;
        double secondCalculation = lineA + lineB - lineC;
        double thirdCalculation = lineB + lineC - lineA;
        double forthCalculation = lineC + lineA - lineB;
        double total = firstCalculation * secondCalculation * thirdCalculation * forthCalculation;

        System.out.println("Area "+ this.getName()+": " +Math.sqrt(total)/4 );
    }

    @Override
    public void Scope() {
        System.out.println("Scope "+ this.getName()+": "+ (lineA + lineB + lineC));
    }

}
