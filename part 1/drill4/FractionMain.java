package lesson1.drill4;

public class FractionMain {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(6,12);
        Fraction f2 = new Fraction(5,20);
        System.out.print("f1: ");
        f1.print();
        System.out.print("f2: ");
        f2.print();
        f1.simplify();
        f2.simplify();
        System.out.println("after simplify");
        System.out.print("f1: ");
        f1.print();
        System.out.print("f2: ");
        f2.print();
        f1.add(f2);
        f1.simplify();
        System.out.println("after add");
        System.out.print("f1: ");
        f1.print();

        Fraction f3 = Fraction.add(f1,f2);
        f3.simplify();
        System.out.print("f3: ");
        f3.print();

    }
}
