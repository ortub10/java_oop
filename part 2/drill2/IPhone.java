package lesson2.drill2;

public class IPhone extends Mobile {
    private double versionOperatingSystem;
    private String icloudAccount;
    private int outMemory;

    public IPhone(int price, String type, int storage, boolean isON, double versionOperatingSystem, String icloudAccount, int outMemory) {
        super(price, type, storage, isON);
        this.versionOperatingSystem = versionOperatingSystem;
        this.icloudAccount = icloudAccount;
        this.outMemory = outMemory;
    }

    public double getVersionOperatingSystem() {
        return versionOperatingSystem;
    }

    public void setVersionOperatingSystem(double versionOperatingSystem) {
        this.versionOperatingSystem = versionOperatingSystem;
    }

    public String getIcloudAccount() {
        return icloudAccount;
    }

    public void setIcloudAccount(String icloudAccount) {
        this.icloudAccount = icloudAccount;
    }

    public int getOutMemory() {
        return outMemory;
    }

    public void setOutMemory(int outMemory) {
        this.outMemory = outMemory;
    }

    @Override
    public boolean checkSpace(int amount) {
        return amount<=this.outMemory + this.getStorage()-this.getStorageInUse();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("versionOperatingSystem=" + versionOperatingSystem +
                ", icloudAccount='" + icloudAccount + '\'' +
                ", outMemory=" + outMemory);

    }

}
