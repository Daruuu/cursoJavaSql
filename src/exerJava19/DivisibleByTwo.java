package exerJava19;

import java.util.Scanner;
//realiza un programa que muetre solamente los numero que sean divisble por 2
public class DivisibleByTwo {
    public static void main(String[] args) {
        DivisibleByTwo d = new DivisibleByTwo();
        System.out.print("introduce un numero random: \n");
        d.numDivisible2();
    }
    public void numDivisible2(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0){
            System.out.println(n + " SI es divisible por 2");
        }else {
            System.out.println( n + " NO es divisible por 2");
        }
    }









}
