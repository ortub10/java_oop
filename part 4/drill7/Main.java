package lesson4.drill7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Courses courses = new Courses();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of teacher or 'enough' to finish ");
        String teacher = scanner.nextLine();
        String lecture, date;
        while (!teacher.equals("enough")){
            HashMap<String,ArrayList<String>> lectures = new HashMap<>() ;
            System.out.println("Enter lecture or 'enough' to finish:");
            lecture = scanner.nextLine();
            while (!lecture.equals("enough")){
                ArrayList<String> dates = new ArrayList<>();
                System.out.println("Enter date or 'enough' to finish:");
                date = scanner.nextLine();
                while (!date.equals("enough")){
                    dates.add(date);
                    System.out.println("Enter date or 'enough' to finish:");
                    date = scanner.nextLine();
                }
                lectures.put(lecture,dates);
                System.out.println("Enter lecture or 'enough' to finish:");
                lecture = scanner.nextLine();
            }
            courses.add(teacher,lectures);
            System.out.println("Enter name of teacher or 'enough' to finish ");
            teacher = scanner.nextLine();
        }

        System.out.println("Enter name of teacher and lecture for to get date or 'enough' to finish");
        System.out.println("Enter name of teacher:");
        teacher = scanner.nextLine();
        while (!teacher.equals("enough")){
            System.out.println("Enter name of lecture:");
            lecture = scanner.nextLine();
            System.out.println(courses.getDate(lecture,teacher));
            System.out.println("Enter name of teacher and lecture for to get date or 'enough' to finish");
            System.out.println("Enter name of teacher:");
            teacher = scanner.nextLine();
        }
    }
}
