package lesson1.drill5;

public class AirConditioner {

    private String created;
    private int temperature;
    private boolean isOn;

    public AirConditioner(){
        this.created = "Tornado";
        this.temperature = 0;
        this.isOn = false;
    }

    public String getCreated(){
        return this.created;
    }

    public int getTemperature(){
        return this.temperature;
    }

    public boolean getIsOn(){
        return this.isOn;
    }

    public void setCreated(String created){
        this.created = created;
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
    }

    public void setIsOn(boolean isOn){
        this.isOn = isOn;
    }

    public void onOff(){
        this.isOn = !this.isOn;
        if (isOn)
            this.temperature = 24;
        else
            this.temperature = 0;
    }

    public void tempUp(){
        if (this.temperature<32)
            this.temperature+=1;
    }

    public void tempDown(){
        if (this.temperature>16)
            this.temperature-=1;
    }

    public void print(){
        System.out.println("This air conditioner created by "+this.created+", temperature "+this.temperature+", is on? "+this.isOn);

    }
}
