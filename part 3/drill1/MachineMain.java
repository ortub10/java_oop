package lesson3.drill1;

public class MachineMain {
    public static void main(String[] args) {
        Machine[] machines= new Machine[4];
        machines[0]  = new Kettle(true,89,25);
        machines[1]  = new Vacuuming(false,85,36);
        machines[2]  = new Computer(true,78,20);
        machines[3]  = new Machine(false,100,50) {
            @Override
            public void printMip() {

                System.out.println("I am the best mip: " + getMip());
            }

            @Override
            public void printVolt() {
                System.out.println("I am the best volt: " + getVolt());

            }

        };

        for (int i = 0; i<machines.length; i++){
            machines[i].printMip();
            machines[i].printVolt();
            if (machines[i] instanceof Kettle) System.out.println(((Kettle)machines[i]).SyaK());
            else if (machines[i] instanceof Vacuuming) System.out.println(((Vacuuming)machines[i]).SyaV());
            else if(machines[i] instanceof Computer) System.out.println(((Computer)machines[i]).SyaC());


        }
    }
}
