package exerJava19;

import java.util.Arrays;

public class Abecedario {
    public static void main(String[] args) {
        Abecedario a = new Abecedario();
        a.abecedario();
    }

    public void abecedario(){
        String[] arrAbecedario = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for ( String abece : arrAbecedario) {
            System.out.println(abece);
        }

    }
}
