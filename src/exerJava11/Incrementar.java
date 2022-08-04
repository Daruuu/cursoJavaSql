package exerJava11;
import java.util.Scanner;

public class Incrementar {
    int numero = 0;
    public static void main(String[] args) {
        Incrementar i = new Incrementar();
        i.incrementa();
        i.incrementa();
        i.decrementa();
        i.decrementa();
        i.decrementa();
        i.decrementa();

    }
    public void incrementa(){
        System.out.println(numero++);
    }
    public void decrementa(){
        System.out.println(--numero);
    }
}
