package lesson4.drill4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();
        System.out.println("Enter word in hebrew or 'enough' to finish");
        String wordHebrew = scanner.nextLine();
        String wordEnglish;
        while (!wordHebrew.equals("enough")){
            System.out.println("Enter word in english");
            wordEnglish = scanner.nextLine();
            if (dictionary.getDictionary().get(wordHebrew)==null){
                dictionary.addToDictionary(wordHebrew,wordEnglish);
            }
            else {
                System.out.println("The word "+ wordHebrew +" already exists, Do you want to swap(yes/no)?");
                String option = scanner.nextLine();
                if (option.equals("yes")){
                    dictionary.addToDictionary(wordHebrew,wordEnglish);
                }
            }
            System.out.println("Enter word in hebrew or 'enough' to finish");
            wordHebrew = scanner.nextLine();
        }

        System.out.println("Enter a sentence in hebrew");
        String sentenceInHebrew = scanner.nextLine();
        System.out.println(dictionary.translate(sentenceInHebrew));
    }
}
