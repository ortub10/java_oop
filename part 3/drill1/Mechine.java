package lesson3.Drill1;

public abstract class Mechine {
    private boolean isOn;
    private int mip;
    private int vate;

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getMip() {
        return mip;
    }

    public void setMip(int mip) {
        this.mip = mip;
    }

    public int getVate() {
        return vate;
    }

    public void setVate(int vate) {
        this.vate = vate;
    }
    public abstract void printMip();
    public abstract void printate();
}
