package lesson1.drill1;

public class Person {
    private String name;
    private long id;
    private int age;

    public Person(String name, long id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public Person() {
        this("john Doe",0,0);
    }

    public Person(String name, long id) {
        this(name,id,30);
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void addYear(){
        this.age++;
    }
   public boolean isBigger(Person other){
        return this.age>other.age;
   }
   public void print(){
       System.out.println("name: "+this.name+", id: "+this.id+", age: "+this.age);
  }

}
