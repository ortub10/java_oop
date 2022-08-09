package lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class drill2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> oranges = new ArrayList<>();
        System.out.println("Enter orange weight or 0 to finish");
        double num = in.nextDouble();
        while (num != 0 ){
            oranges.add(num);
            num = in.nextDouble();
        }
        if (oranges.isEmpty()) return;
        System.out.println("Before sort:");
        System.out.println(oranges);
        Collections.sort(oranges);
        System.out.println("After sort up:");
        System.out.println(oranges);

//        Comparator cop = new Comparator<Double>() {
//            @Override
//            public int compare(Double o1, Double o2) {
//                return (int) (o2 - o1);
//
//            }
//        };
        //System.out.println("after doun");
       // Collections.sort(oranges,cop);
        //System.out.println(oranges);

        System.out.println("After sort down:");
        Collections.sort(oranges,new comp());
        System.out.println(oranges);
        }
    }

 class comp implements Comparator<Double>{
      @Override
      public int compare(Double o1, Double o2) {
          return (int) (o2 - o1);
      }
  }
