package lesson3.drill1;

public abstract class Machine {
    private boolean isOn;
    private int mip;
    private int volt;

    public Machine(boolean isOn, int mip, int volt) {
        this.isOn = isOn;
        this.mip = mip;
        this.volt = volt;
    }

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

    public int getVolt() {
        return volt;
    }

    public void setVolt(int volt) {
        this.volt = volt;
    }
    public abstract void printMip();
    public abstract void printVolt();
}
