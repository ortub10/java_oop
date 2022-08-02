package lesson3.drill5;

import java.util.Arrays;

public class phoneMain {
    public static void main(String[] args) {
        Phone phones[] = new Phone[5];
        phones[0] = new Phone(4,"android",20010,100);
        phones[1] = new Phone(4,"lg",207,100);
        phones[2] = new Phone(3,"android",21000,10);
        phones[3] = new Phone(4,"iphone",20004,61);
        phones[4] = new Phone(4,"iphone",207,76);

        System.out.println("Before sort: ");
        printPhones(phones);
        System.out.println("After sort: ");
        Arrays.sort(phones);
        printPhones(phones);
    }

    public static void printPhones(Phone[] phones){
        for (Phone phone: phones)
            System.out.println(phone);
    }
}
