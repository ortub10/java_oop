package lesson1.drill2;

public class WorkerMain {
    public static void main(String[] args) {
        Worker [] works = new Worker[3];
        works[0]  = new Worker("Tal",7,4000,27);
        works[1]  = new Worker( "Or",1,3000,28);
        works[2]  = new Worker("Ron",5,5000,32);
        int max = works[0].getPrice();
        int flag = 0;
        int many = works[0].getExp();
        int flag2 = 0;
        for (int i = 1; i<works.length; i++){
            if (works[i].getPrice()>max){
                max = works[i].getPrice();
                flag = i;
            }
            if (works[i].getExp()>many){
                many = works[i].getExp();
                flag2 = i;
            }
        }
        works[flag].print();

        works[flag2].addBonus(2000);
        System.out.print("The more exp: ");
                works[flag2].print();
    }
}
