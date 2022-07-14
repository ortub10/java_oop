package lesson2.drill2;

public class testMain {
    public static void main(String[] args) {
        Mobile [] mobiles = new Mobile[6];
        mobiles[0] =new Android(2800,"i7",32,false,"marsmelo",20,"or");
        mobiles[1] =new Android(1800,"i5",12,false,"tut",70,"mor");
        mobiles[2] =new Android(3800,"edge i7",64,true,"oreo",40,"dor");
        mobiles[3] =new IPhone(3200,"dor3",14,true,1.5,"good",10);
        mobiles[4] =new IPhone(2300,"dor4",24,false,3.5,"ok",67);
        mobiles[5] =new IPhone(6000,"dorX",64,true,6.5,"best",50);


        int sumPriceAndroid = 0;
        int countAndroid = 0;
        int sumPriceIPhone = 0;
        int countIPhone = 0;
        int countMobileWithSpace = 0;
        for (Mobile m: mobiles){
            if (!m.isON()) m.onOff();
            if (m.checkSpace(64)) countMobileWithSpace++;
            if (m instanceof Android) {
                sumPriceAndroid += m.getPrice();
                countAndroid++;
                System.out.println("Android os:"+((Android) m).getOperatingSystem());
            }
            else if ((m instanceof IPhone)) {
                sumPriceIPhone += m.getPrice();
                countIPhone++;
            }
        }
        double averageAndroid = (double) sumPriceAndroid/countAndroid;
        double averageIPhone = (double) sumPriceIPhone/countIPhone;
        System.out.println("The average price of android mobile: "+averageAndroid);
        System.out.println("The average price of IPhone mobile: "+averageIPhone);
        System.out.println("Number of mobile with place over 64: "+countMobileWithSpace);
    }
}
