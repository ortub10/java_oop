package lesson1.drill5;

public class AirConditionerMain {
    public static void main(String[] args) {
		
       AirConditioner controlDad,controlYoav,controlMom;
       controlDad = controlYoav = controlMom = new AirConditioner();
        controlDad.onOff();
        controlDad.tempDown();
        controlDad.tempDown();
        System.out.println("Yoav filling:");
        controlYoav.print();
        controlYoav.tempUp();
        controlYoav.tempUp();
        controlYoav.tempUp();
        controlYoav.tempUp();
        System.out.println("Mom filling:");
        controlMom.print();
        controlMom.onOff();
        System.out.println("Dad filling:");
        controlDad.print();


    }
}
