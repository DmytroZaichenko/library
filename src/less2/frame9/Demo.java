package less2.frame9;

/**
 * Created by DmitryZ on 06.11.2015.
 */
public class Demo {

    public static void main(String[] args) {
        Instrument i = new Instrument();
        Flute flute = new Flute();

        Musiacian musiacian = new Musiacian();

        musiacian.play(flute);

    }
}
