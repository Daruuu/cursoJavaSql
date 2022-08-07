package exerJava19;

import java.util.Scanner;

public class SaludarFor {
    public static void main(String[] args) {
        SaludarFor s1 = new SaludarFor();
        s1.saludaFOR();
    }
    public void saludaFOR(){
        Scanner sc = new Scanner(System.in);
        int numSaludos = sc.nextInt();
        String hola = "hola que tal!";
        for (int i = 0; i < numSaludos; i++) {
            System.out.println(hola);
        }
        sc.close();
    }
}
