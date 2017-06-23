package Classes;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by brunocesar on 23/06/17.
 */
public class TesteGregoryCalendar {

    public static void main(String args[]){

        // Nao muito utilizado
        GregorianCalendar today = new GregorianCalendar();

        today.isLeapYear(2017);
        //Ano biscesto
        System.out.println(today.isLeapYear(2020));

        GregorianCalendar today2 = new GregorianCalendar(2017,0,1);

        System.out.println(today.isLeapYear(2020));



    }

}
