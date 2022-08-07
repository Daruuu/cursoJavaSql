package exerJava19;

import java.util.Scanner;

public class SaludarDoWhile {
    public static void main(String[] args) {
        SaludarDoWhile s3 = new SaludarDoWhile();
        s3.saludarDOWHILE();
    }

    public void saludarDOWHILE() {
        Scanner sc = new Scanner(System.in);

        String hellos = "hello, how are you!";
        int i = 0;
        int nHola = sc.nextInt();
        do {
            System.out.println(hellos);
            i++;
        } while (i < nHola);
    }
}
