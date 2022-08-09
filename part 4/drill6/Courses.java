package lesson4.drill6;

import java.util.HashMap;

public class Courses {
    private HashMap<String, HashMap<String, String> > dataForLectures;

    public Courses() {
        this.dataForLectures = new HashMap<>();
    }


    public void add(String teacher, HashMap<String ,String> lectures){
        this.dataForLectures.put(teacher, lectures);
    }

    public String getDate(String lecture, String teacher){
        if (this.dataForLectures.get(teacher)==null) return "No exits this teacher";
        HashMap<String,String > lectures = this.dataForLectures.get(teacher);
        if (lectures.get(lecture) == null) return "No exits this lecture";
        return lectures.get(lecture);
    }
}
