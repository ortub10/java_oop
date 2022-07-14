package lesson2.drill2;

public class Mobile {
    private int price;
    private String type;
    private int storage;
    private int storageInUse;
    private boolean isON;

    public Mobile(int price, String type, int storage, boolean isON) {
        this.price = price;
        this.type = type;
        this.storage = storage;
        this.storageInUse = 0;
        this.isON = isON;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getStorageInUse() {
        return storageInUse;
    }

    public void setStorageInUse(int storageInUse) {
        this.storageInUse = storageInUse;
    }

    public boolean isON() {
        return isON;
    }

    public void setON(boolean ON) {
        isON = ON;
    }
    public void onOff(){
        this.isON = !this.isON;
    }

    public boolean checkSpace(int amount){
        return amount<=this.storage - this.storageInUse;
    }

    public void print() {
        System.out.println("price=" + price +
                ", type='" + type + '\'' +
                ", storage=" + storage +
                ", storageInUse=" + storageInUse +
                ", isON=" + isON);
    }

}
