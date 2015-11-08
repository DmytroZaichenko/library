package less2.frame9;

/**
 * Created by DmitryZ on 06.11.2015.
 */
public class Instrument {

    public final String PRODUCER;
    //public final String PRODUCER;
    public void sound(){
        System.out.println("Did you hear anything?");
    }

    public Instrument(String s) {
        PRODUCER = s;
    }
}
