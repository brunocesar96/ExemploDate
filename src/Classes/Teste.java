package Classes;

import java.util.Date;

/**
 * Created by brunocesar on 23/06/17.
 */
public class Teste {

    public static void main(String args[]){

        // Nao e a melhor maneira de se trabalhar com datas em java
        Date today = new Date();

        //Da a hr atual
        System.out.println(today);

        System.out.println("Milisegundos desde 1 de jan 1970" + today.getTime());

        System.out.println(today.getDate());


    }
}
