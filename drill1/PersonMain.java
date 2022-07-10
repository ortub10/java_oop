package lesson1.drill1;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("Or", 22222, 27);
        Person p2 = new Person("Tal", 121212);
        p1.print();
        p2.print();
        if(p1.isBigger(p2)) System.out.println(p1.getName()+" bigger then "+ p2.getName());
        else System.out.println(p2.getName()+" bigger then "+p1.getName());

    }
}
