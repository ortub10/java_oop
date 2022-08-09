package lesson4.drill7;

import java.util.ArrayList;
import java.util.HashMap;

public class Courses {
    private HashMap<String, HashMap<String, ArrayList<String>> > dataForLectures;

    public Courses() {
        this.dataForLectures = new HashMap<>();
    }


    public void add(String teacher, HashMap<String ,ArrayList<String>> lectures){
        this.dataForLectures.put(teacher, lectures);
    }

    public String getDate(String lecture, String teacher){
        if (this.dataForLectures.get(teacher)==null) return "No exits this teacher";
        HashMap<String,ArrayList<String>> lectures = this.dataForLectures.get(teacher);
        if (lectures.get(lecture) == null) return "No exits this lecture";
        return lectures.get(lecture).toString();
    }
}
