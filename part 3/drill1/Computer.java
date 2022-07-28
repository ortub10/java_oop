package lesson3.drill1;

public class Computer extends Machine {
    public Computer(boolean isOn, int mip, int volt) {
        super(isOn, mip, volt);
    }

    @Override
    public void printMip() {
        System.out.println("The mip of computer is:"+this.getMip());
    }

    @Override
    public void printVolt() {
        System.out.println("The volt of computer is:"+this.getVolt());
    }

    public String SyaC(){
        return "i am computer";
    }
}
