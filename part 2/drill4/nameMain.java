package lesson2.drill4;

public class nameMain {
    public static void main(String[] args) {
        Name n1 = new Name("Or","Tubul");
        Name n2 = new Name("Or","Tubul");
        Name n3 = new Name("Bar","Levi");
        Name n4 = new Name(n3);
        Name n5 = n4;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n1==n2);
        System.out.println(n1.equals(n2));
        System.out.println(n1==n3);
        System.out.println(n1.equals(n3));
        System.out.println(n3==n4);
        System.out.println(n3.equals(n4));
        System.out.println(n4==n5);
        System.out.println(n4.equals(n5));




    }
}
