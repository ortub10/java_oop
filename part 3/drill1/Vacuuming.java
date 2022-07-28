package lesson3.drill1;

public class Vacuuming extends Machine {
    public Vacuuming(boolean isOn, int mip, int volt) {
        super(isOn, mip, volt);
    }

    @Override
    public void printMip() {
        System.out.println("The mip of vacuuming is:"+this.getMip());
    }

    @Override
    public void printVolt() {
        System.out.println("The volt of vacuuming is:"+this.getVolt());
    }

    public String SyaV(){
        return "i am vacuuming";
    }
}
