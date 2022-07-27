package lesson3.Drill1;

public class MechineMain {
    public static void main(String[] args) {
        Mechine [] mech= new Mechine[4];
        mech[2]  = new kumkum();
        mech[1]  = new Soev();
        mech[0]  = new Computer();
        mech[3]  = new Mechine() {
            @Override
            public void printMip() {

                System.out.println("I am the best mip");
            }

            @Override
            public void printate() {
                System.out.println("I am the best vate");

            }
            public String pou(){
                return "fgfdgvd";
            }

        };
        mech[0].setMip(89);

        for (int i = 0; i<mech.length; i++){
            mech[i].printMip();
            mech[i].printate();
            if (mech[i] instanceof kumkum) System.out.println(((kumkum)mech[i]).Syak());
            else if (mech[i] instanceof Soev) System.out.println(((Soev)mech[i]).Syas());
            else if(mech[i] instanceof Computer) System.out.println(((Computer)mech[i]).Syac());

        }
    }
}
