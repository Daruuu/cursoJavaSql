package exerJava19;

import java.util.Arrays;
import java.util.Scanner;

//escribe un programa que a partir de un array de numeros por pantalla, muestre los que sean divisibles por 3
public class DivisibleByThreeFor {
    public static void main(String[] args) {
        DivisibleByThreeFor t = new DivisibleByThreeFor();
        t.numDivFor();
    }
    public void numDivFor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el lenght del array:\n");
        int n = sc.nextInt();

        int[] arrayOne = new int[n];
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arrayOne));
        for (int array: arrayOne) {
            System.out.println(array % 3 == 0 ? "SI es divisible por 3" : "NO es divisible por 3");
        }
    }
    /*
    public void divisibleONo(){
        if (arrayOne[i] % 3 == 0) {
            System.out.println(arrayOne[i] + " ");
        } else {
            System.out.println("No es divisible entre 3");
        }
        System.out.println(Arrays.toString(arrayOne));
    }*/



}
