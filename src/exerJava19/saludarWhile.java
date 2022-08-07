package exerJava19;

import java.util.Scanner;

public class saludarWhile {
    public static void main(String[] args) {
        saludarWhile s2 = new saludarWhile();
        s2.saludarWHILE();
    }
    public void saludarWHILE(){
        Scanner sc = new Scanner(System.in);
        int numSaludos = sc.nextInt();
        int i = 0;
        String hello = "Hello what's up!";
        while (i < numSaludos){
            System.out.println(hello);
            i++;
        }
        sc.close();
    }
}
