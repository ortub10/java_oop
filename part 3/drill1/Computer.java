package lesson3.Drill1;

public class Computer extends Mechine {
    @Override
    public void printMip() {
        System.out.println("The mip of comuter is:"+this.getMip());
    }

    @Override
    public void printate() {
        System.out.println("The vate of computer is:"+this.getVate());
    }

    public String Syac(){
        return "i am computer";
    }
}
