package exerJava20;

import java.util.Scanner;

// realiza un programa que muestre un numero (que salga de la iteracion) y un texto cualquiera (por ejemplo iteracion).

// y si el bucle llega a la 5a (loop) no imprima el mensaje y te heche fuera del loop pero no del bucle
public class InstruccionLoopSalto {
    public static void main(String[] args) {
        InstruccionLoopSalto ilt = new InstruccionLoopSalto();
        ilt.iteracionNumero();
    }

    public void iteracionNumero(){
        int n = 5;

        for (int i = 1; i < 8; i++) {
            if (i == n) {
                continue;
            }
            System.out.println(i + " iteracion");
        }
    }
}
