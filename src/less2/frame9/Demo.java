package less2.frame9;

import com.sun.xml.internal.txw2.output.IndentingXMLFilter;

/**
 * Created by DmitryZ on 06.11.2015.
 */
public class Demo {


    public static void main(String[] args) {

        Instrument i = new Instrument("comp");

        System.out.println(i.PRODUCER);
        //i.PRODUCER = "rt";

        Instrument i2 = new Instrument("comp2");
        System.out.println(i2.PRODUCER);
        System.out.println(i.PRODUCER);
//        Flute flute = new Flute();
//
//        Musiacian musiacian = new Musiacian();
//
//        musiacian.play(flute);
//
//        System.out.println(i instanceof Instrument);

    }
}
