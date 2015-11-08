package less2.frame9;

/**
 * Created by DmitryZ on 06.11.2015.
 */
public class Musiacian {

    public void play(Instrument i){
        if(i instanceof Flute){
            Flute f = (Flute) i;
            f.test();
        }

        i.sound();

    }
}
