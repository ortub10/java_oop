package lesson1.drill6;

public class LineMain {
    public static void main(String[] args) {

        Point A = new Point(-6,5);
        Point B = new Point(-2,9);
        Point C = new Point(1,6);
        Point D = new Point(-3,2);

        Line AB = new Line(A,B);
        Line BC = new Line(B,C);
        Line CD = new Line(C,D);
        Line DA = new Line(D,A);

        double distanceAB = AB.distance();
        double distanceBC = BC.distance();
        double distanceCD = CD.distance();
        double distanceDA = DA.distance();

    //prove that it rectangle
        System.out.println("distanceAB: "+distanceAB);
        System.out.println("distanceCD: "+distanceCD);

        System.out.println("----------------");

        System.out.println("distanceBC: "+distanceBC);
        System.out.println("distanceDA: "+distanceDA);

        double slopeAB = AB.slope();
        double slopeBC = BC.slope();

        System.out.println(slopeAB*slopeBC);


    }
}
