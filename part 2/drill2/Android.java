package lesson2.drill2;

public class Android extends Mobile {
    private String operatingSystem;
    private int outMemory;
    private String googleAccountName;

    public Android(int price, String type, int storage, boolean isON, String operatingSystem, int outMemory, String googleAccountName) {
        super(price, type, storage, isON);
        this.operatingSystem = operatingSystem;
        this.outMemory = outMemory;
        this.googleAccountName = googleAccountName;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getOutMemory() {
        return outMemory;
    }

    public void setOutMemory(int outMemory) {
        this.outMemory = outMemory;
    }

    public String getGoogleAccountName() {
        return googleAccountName;
    }

    public void setGoogleAccountName(String googleAccountName) {
        this.googleAccountName = googleAccountName;
    }

    @Override
    public boolean checkSpace(int amount) {
        return amount<=this.outMemory + this.getStorage()-this.getStorageInUse();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("operatingSystem='" + operatingSystem + '\'' +
                ", outMemory=" + outMemory +
                ", googleAccountName='" + googleAccountName + '\'');

    }

}
