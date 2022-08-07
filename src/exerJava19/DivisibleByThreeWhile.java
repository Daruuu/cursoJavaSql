package exerJava19;

import java.util.Arrays;
import java.util.Scanner;

public class DivisibleByThreeWhile {
    public static void main(String[] args) {
        DivisibleByThreeWhile dw = new DivisibleByThreeWhile();
        dw.numDivWhile();
    }
    public void numDivWhile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el lenght del array: ");
        int n = sc.nextInt();
        int[] arrayTwo = new int[n];
        int i = 0;
        while (i < arrayTwo.length) {
            arrayTwo[i] = sc.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(arrayTwo));
    }
    /*
            System.out.println(arrayTwo.length + " ");

        for (int array : arrayTwo) {
        System.out.println(array % 3 == 0 ? "SI es divisible por 3" : "NO es divisible por 3");
    }
     */
}
