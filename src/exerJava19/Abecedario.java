package exerJava19;

import java.util.Arrays;

public class Abecedario {
    //String[] arrAbecedario = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    public static void main(String[] args) {
        Abecedario a = new Abecedario();
        a.abecedario();
    }

    public void abecedario(){
        String[] arrAbecedario = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (int i = 0; i < arrAbecedario.length; i++) {
            System.out.print(arrAbecedario[i]);
            for (int j = i + 1; j < arrAbecedario.length; j++) {
                System.out.print(arrAbecedario[j]);
            }
            System.out.println();
        }

    }
}
