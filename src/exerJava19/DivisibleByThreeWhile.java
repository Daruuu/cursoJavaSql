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
        int x = sc.nextInt();
        int[] arrayTwo = new int[x];

        int i = arrayTwo.length;
        int p = 0;
        while (p < i) {
            arrayTwo[i] = sc.nextInt();
            System.out.println(arrayTwo[i] + " ");
            p++;
        }

        System.out.println(Arrays.toString(arrayTwo));
        for (int array : arrayTwo) {
            System.out.println(array % 3 == 0 ? "SI es divisible por 3" : "NO es divisible por 3");
        }
    }
}
