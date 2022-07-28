package lesson3.drill1;

public class Kettle extends Machine {
    public Kettle(boolean isOn, int mip, int volt) {
        super(isOn, mip, volt);
    }

    @Override
    public void printMip() {
        System.out.println("The mip of Kettle is:"+this.getMip());
    }

    @Override
    public void printVolt() {
        System.out.println("The volt of Kettle is:"+this.getVolt());
    }

    public String SyaK(){
        return "i am Kettle";
    }
}
