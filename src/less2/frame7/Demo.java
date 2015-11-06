package less2.frame7;

import ext.*;

public class Demo {

    public static void main(String[] args) {


        BT7 bt7 = new BT7("BT7",Colors.BLACK,3,72);
        bt7.printInfo(bt7);
        bt7.move();

        T34 t34 = new T34("T34",Colors.BLACK,4,50);
        t34.printInfo(t34);
        t34.move();

        Tiger tiger = new Tiger("Tiger",Colors.GREEN,4,30,1);
        tiger.printInfo(tiger);
        tiger.move();


    }

}
