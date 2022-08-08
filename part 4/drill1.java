package lesson4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class drill1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> ls = new ArrayList<>();
        System.out.println("Enter number or 'enough' to stop: ");
        String str = sc.next();
        while (!(str.equals("enough"))) {
            double num = Double.parseDouble(str);
            ls.add(num);
            str = sc.next();
        }
        System.out.println(ls);
        if (ls.isEmpty()) return;


        System.out.println("now enter number to compare:");
        double comp = sc.nextDouble();
        int count = 0;
        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i) == comp) count++;
        }
		
        System.out.println(comp + " in list " + count + " times");
		
        if (count != 0) {
             Iterator<Double> iterator = ls.iterator();
            while (iterator.hasNext()){
                if(iterator.next()==comp) iterator.remove();
            }
        }
		
        for (int i = ls.size()-1; i >= 0; i--) {
            System.out.println(ls.get(i));
        }
    }
}
