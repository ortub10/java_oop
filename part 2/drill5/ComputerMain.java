package lesson2.drill5;

public class ComputerMain {
    public static void main(String[] args) {
        System.out.println("level 1:");
        Computer c1 = new Computer(3000,"Del",250,15.6);
        Computer c2 = new Computer(3000,"Del",250,15.6);
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));
        System.out.println(c1);

        System.out.println("level 2:");
        Computer c3 = new Computer(3000,"Del",250,15.6);
        Computer c4 = new Computer(3030,"Intel",950,16.6);
        System.out.println(c3 == c4);
        System.out.println(c3.equals(c4));

        System.out.println("level 3:");
        Computer c5 = new Computer(3000,"Del",250,15.6);
        Computer c6 = new Computer(c5);
        System.out.println(c5 == c6);
        System.out.println(c5.equals(c6));

        System.out.println("level 4:");
        Computer c7, c8;
        c7 = c8 = new Computer(1234,"apple",450,12.9);
        System.out.println(c7 == c8);
        System.out.println(c7.equals(c8));

    }
}
