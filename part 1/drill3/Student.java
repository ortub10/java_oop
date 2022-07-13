package lesson1.drill3;

import java.util.Arrays;

public class Student {
    private String name;
    private String topic;
    private int[] grades;
    private int inside;

    public Student(String name, String topic){
        this.name = name;
        this.topic = topic;
        this.grades = new int[10];
        this.inside = 0;
    }
    public Student(Student other){
        this.name = other.name;
        this.topic = other.topic;
        this.grades  = new int[10];
        for (int i = 0; i< other.grades.length; i++){
            this.grades[i] =  other.grades[i];
        }
        this.inside = other.inside;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public boolean addGrade(int grade){
        if (inside<this.grades.length){
            this.grades[inside] = grade;
            this.inside++;
            return true;
        }
        return false;
    }
       public double computeAvg(){
        int sum = 0;
        for (int i = 0; i<this.inside;i++){
            sum+=this.grades[i];
        }
        return (double)sum/this.inside;
       }
    public boolean compareAvg(Student other){
           return this.computeAvg()>other.computeAvg();
    }

    public void print() {
        System.out.println(
                "name='" + name + '\'' +
                ", topic='" + topic + '\'' +
                ", grades=" + Arrays.toString(grades) +
                ", inside=" + inside);
    }
}
