package lesson5.drill2;

public class Student extends Human {
    private String topic;

    public Student(String name, int id, String topic) {
        super(name, id);
        this.topic = topic;
    }

    public void learn(){
        System.out.println(this.getName()+" is student and learn "+this.topic);
    }
}
