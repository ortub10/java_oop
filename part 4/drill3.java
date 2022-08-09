package lesson4;

import java.util.HashMap;
import java.util.Scanner;

public class drill3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String,String> dictionary = new HashMap<>();
        System.out.println("Enter word in hebrew or 'enough' to finish");
        String wordHebrew = scanner.nextLine();
        String wordEnglish;
        while (!wordHebrew.equals("enough")){
            System.out.println("Enter word in english");
                wordEnglish = scanner.nextLine();
            if (dictionary.get(wordHebrew)==null){
                dictionary.put(wordHebrew,wordEnglish);
            }
            else {
                System.out.println("The word "+ wordHebrew +" already exists, Do you want to swap(yes/no)?");
                String option = scanner.nextLine();
                if (option.equals("yes")){
                    dictionary.put(wordHebrew,wordEnglish);
                }
            }
            System.out.println("Enter word in hebrew or 'enough' to finish");
            wordHebrew = scanner.nextLine();
        }

        System.out.println("Enter a sentence in hebrew");
        String sentenceInHebrew = scanner.nextLine();
        System.out.println(sentenceInHebrew);
        String[] words = sentenceInHebrew.split(" ");

        StringBuffer sentenceInEnglish = new StringBuffer();
        for (String word: words){
            if (dictionary.get(word) == null){
                sentenceInEnglish.append(word);
            }
            else {
            sentenceInEnglish.append(dictionary.get(word));
            }
            sentenceInEnglish.append(" ");
        }
        System.out.println(sentenceInEnglish);
    }
}
