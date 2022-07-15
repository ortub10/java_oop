package lesson2.drill3;

public class Kipur extends Shabet {
    private String timeShofar;
    private int zomTime;

    public Kipur(String inShbat, String outShbat, String timeShofar, int zomTime) {
        super(inShbat, outShbat);
        this.timeShofar = timeShofar;
        this.zomTime = zomTime;
    }

    public String getTimeShofar() {
        return timeShofar;
    }

    public void setTimeShofar(String timeShofar) {
        this.timeShofar = timeShofar;
    }

    public int getZomTime() {
        return zomTime;
    }

    public void setZomTime(int zomTime) {
        this.zomTime = zomTime;
    }

    @Override
    public String pray(int time) {
        if (time >= 19 && time <=22)
            return "kol nidrai";
        if (time >=6 && time <=14)
            return "Sharit";
        return "mincha";
    }
    public void ride(){
        System.out.println("I ride to me in road");
    }
}