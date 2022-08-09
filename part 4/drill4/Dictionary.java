package lesson4.drill4;

import java.util.HashMap;

public class Dictionary {

    private HashMap<String,String > dictionary;

    public Dictionary() {
        this.dictionary =  new HashMap<>();
    }

    public HashMap<String, String> getDictionary() {
        return dictionary;
    }

    public void addToDictionary(String wordHebrew, String wordEnglish){
        this.dictionary.put(wordHebrew,wordEnglish);
    }

    public StringBuffer translate(String sentence){
        String[] words = sentence.split(" ");
        StringBuffer sentenceInEnglish = new StringBuffer();
        for (String word: words){
            if (this.dictionary.get(word) == null){
                sentenceInEnglish.append(word);
            }
            else {
                sentenceInEnglish.append(this.dictionary.get(word));
            }
            sentenceInEnglish.append(" ");
        }
        return sentenceInEnglish;
    }
}
