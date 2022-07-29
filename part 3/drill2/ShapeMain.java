package lesson3.drill2;

public class ShapeMain {

    public static void main(String[] args) {
        Shape [] shapes = new Shape[3];
        shapes[0] = new Circle("Circle", 4);
        shapes[1] = new Rectangle("Rectangle", 4,5);
        shapes[2] = new Triangle("Triangle", 3,4,5);

        for (Shape shape: shapes){
            System.out.println(shape);
            shape.area();
            shape.Scope();
            System.out.println("---------------");
        }
    }
}
