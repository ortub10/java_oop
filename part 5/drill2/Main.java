package lesson5.drill2;

public class Main {
    public static void main(String[] args) {
        Human[] humans = new Human[5];
        humans[0] = new Human("Mark",25638);
        humans[1] = new Student("Clark",63148,"Computer");
        humans[2] = new Human("Math",29485);
        humans[3] = new Student("Steve",88856,"Math");
        humans[4] = new Human("Math",64785);

        /*for (Human human: humans){wrong way!!!
            try {
            ((Student)human).learn();
            }catch (ClassCastException ex){
                System.out.println("No a student");
            }
        }*/

        for (Human human:humans){// correct way
            if (human instanceof  Student){
                ((Student)human).learn();
            }
            else {
                System.out.println("No a student");
            }
        }
    }
}
