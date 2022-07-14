package lesson2.drill1;

public class ElectricCar extends Car {
    private int vat;
    private int maxSol;
    private int nowSol;

    public ElectricCar(int price, String kind, int volume, int vat, int maxSol, int nowSol) {
        super(price, kind, volume);
        this.vat = vat;
        this.maxSol = maxSol;
        this.nowSol = nowSol;
    }

    public int getVat() {
        return vat;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }

    public int getMaxSol() {
        return maxSol;
    }

    public void setMaxSol(int maxSol) {
        this.maxSol = maxSol;
    }

    public int getNowSol() {
        return nowSol;
    }

    public void setNowSol(int nowSol) {
        this.nowSol = nowSol;
    }
    public void charge(){
        this.nowSol=this.getMaxSol();
    }


    @Override
    public void print() {
        super.print();
        System.out.println(
                "vat=" + vat +
                        ", maxSol=" + maxSol +
                        ", nowSol=" + nowSol);
    }
}
