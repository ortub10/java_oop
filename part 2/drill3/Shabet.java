package lesson2.drill3;

public class Shabet {
    private String inShbat;
    private String outShbat;

    public Shabet(String inShbat, String outShbat) {
        this.inShbat = inShbat;
        this.outShbat = outShbat;
    }

    public String getInShbat() {
        return inShbat;
    }

    public void setInShbat(String inShbat) {
        this.inShbat = inShbat;
    }

    public String getOutShbat() {
        return outShbat;
    }

    public void setOutShbat(String outShbat) {
        this.outShbat = outShbat;
    }

    public String pray(int time){
        if (time>=6 && time<=10)
            return "Shaharit";
        if (time>=13 && time<=16)
            return "Mincha";
        if (time>=18 && time<=24)
            return "Arvit";
        return "No pray";
    }
}
