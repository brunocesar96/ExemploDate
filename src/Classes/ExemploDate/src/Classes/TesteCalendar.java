package Classes;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by brunocesar on 23/06/17.
 */
public class TesteCalendar {

    public static void main(String args[]){

        // Retorna um calendario , sei deixar o usuario instaciar o objeto
        // Padrao singleton
        Calendar today = Calendar.getInstance();

        int ano = today.get(Calendar.YEAR);
        int mes = today.get(Calendar.MONTH);
        int dia = today.get(Calendar.DAY_OF_MONTH);
        int hora = today.get(Calendar.HOUR_OF_DAY);
        int minutos = today.get(Calendar.MINUTE);
        int segundos = today.get(Calendar.SECOND);

        System.out.printf("Hoje e : %02d/%02d/%d" ,dia,(mes+1), ano);

    }
}
