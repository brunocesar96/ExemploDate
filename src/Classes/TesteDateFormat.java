package Classes;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by brunocesar on 23/06/17.
 */
public class TesteDateFormat {

    public static void main( String[] args){

        Date today = new Date();

        Locale.setDefault(new Locale("en","US"));
        System.out.println(Locale.getDefault());


        String todayFormated = DateFormat.getInstance().format(today);
        //System.out.println(today);

        todayFormated = DateFormat.getTimeInstance().format(today);
        System.out.println(today);

    }


}
