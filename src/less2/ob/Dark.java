package less2.ob;

/**
 * Created by admin on 08.11.2015.
 */
public class Dark {

    private int monthlyPayment;
    private int interest;
    private int dreamSum;

    public Dark(int monthlyPayment, int interest, int dreamSum) {

        this.monthlyPayment = monthlyPayment;
        this.interest = interest;
        this.dreamSum = dreamSum;
    }

    public int calculate(){

        int sum   = 0;
        int month = 0;
        int procInMonth = interest / 12;

        while (sum  < dreamSum ){

            sum += monthlyPayment;
            sum +=  sum * procInMonth /100;
            month ++;

        }

        return month /12;

    }
}
