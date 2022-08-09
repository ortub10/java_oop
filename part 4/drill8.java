package lesson4;

import java.util.Scanner;
import java.util.Stack;

public class drill8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        System.out.println("Enter exercise");
        String exercise = scanner.nextLine();
        boolean isOk = true;
        char old;
        for (int i =0; i<exercise.length()&&isOk; i++){
            if(exercise.charAt(i)=='{'||exercise.charAt(i)=='['||exercise.charAt(i)=='('){
                st.push(exercise.charAt(i));
            }
            else if(exercise.charAt(i)=='}'||exercise.charAt(i)==']'||exercise.charAt(i)==')'){
                if (st.empty()) isOk = false;
                else{
                    old = st.pop();
                    if((exercise.charAt(i)=='}' && old !='{')||(exercise.charAt(i)==']' && old !='[')||(exercise.charAt(i)==')' && old !='('))
                        isOk = false;
                }
            }
        }
        if (isOk) System.out.println("proper exercise");
        else System.out.println("not proper exercise");

    }
}
