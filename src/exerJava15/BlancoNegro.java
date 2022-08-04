package exerJava15;

import java.util.Scanner;
public class BlancoNegro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        BlancoNegro bn = new BlancoNegro();
        bn.numRandom();
    }

    public void numRandom() {
        for (int i = 0; i < 1; i++) {
            double randomNum = Math.random();
            System.out.println(randomNum);
        }
    }


}

