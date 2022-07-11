package lesson1.drill2;

public class Worker {
    private String name;
    private int exp;// נסיון
    private int price;
    private int age;

    public Worker(String name, int exp, int price, int age) {
        this.name = name;
        this.exp = exp;
        this.price = price;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void addBonus(int amount){
        this.price+=amount;
    }

    public void print() {
        System.out.println(
                "name='" + name + "'" +
                ", exp=" + exp +
                ", price=" + price +
                ", age=" + age );
    }
}
