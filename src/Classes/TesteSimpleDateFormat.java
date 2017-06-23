package Classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by brunocesar on 23/06/17.
 */
public class TesteSimpleDateFormat {

    //formated dates using Simple Date Format
    public  static void main(String args[]) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z"); // ou dd/MMM/yyyy

        Calendar data = new GregorianCalendar(2017, 2, 20, 14, 32, 25);
        System.out.println(sdf.format(data.getTime()));

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); // ou dd/MMM/yyyy
        String myDate = "20/02/2017";

        Date myDateinDate = sdf1.parse(myDate);
        System.out.println(myDateinDate);

        System.out.println(sdf.format(myDateinDate));

    }


}
