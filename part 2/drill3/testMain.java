package lesson2.drill3;

import java.util.Scanner;

public class testMain {
    public static void main(String[] args) {
        Shabet[] shabets = new Shabet[3];
        shabets[0] = new Shabet("19:20","20:30");
        shabets[1] = new Shabet("16:30","17:40");
        shabets[2] = new Kipur("18:30","19:40","17:00",25);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter time");
        int time = scanner.nextInt();
        for (Shabet sb: shabets) {

            System.out.println(sb.pray(time));
            if (sb instanceof Kipur)
                ((Kipur) sb).ride();
            System.out.println();
        }
    }
}
