package exerJava22;

import java.sql.SQLOutput;

//define conastnates para valores RESET, RED , YELLOW,
//tanto para el (background), color texto(color), tipos de texto.
public class ConstanteColor {

    final static String RESET = "\u001B[0m" ;
    final static String RED = "\033[0;31m";
    final static String RED_BACKGROUND = "\u001B[41m";
    final static String YELLOW = "\u001B[33m";
    final static String YELLOW_BACKGROUND = "\u001B[43m";

    public static void main(String[] args) {
        //ConstanteColor cc = new ConstanteColor();
        System.out.println(YELLOW + RED_BACKGROUND + "        ASFD      " + RESET);
        System.out.println(RED_BACKGROUND);
        System.out.println(RESET);
        System.out.println(YELLOW);

        System.out.println(YELLOW_BACKGROUND);
    }

    public void transformaTexto(String texto,String red){
        System.out.println(texto);
        System.out.println();
    }



}
