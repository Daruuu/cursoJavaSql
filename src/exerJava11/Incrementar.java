package exerJava11;
import java.util.Scanner;

public class Incrementar {
    int numero = 0;
    public static void main(String[] args) {
        Incrementar e = new Incrementar();
        Scanner sc = new Scanner(System.in);
        int numCreciente = sc.nextInt();
        int numDecreciente = sc.nextInt();
        e.incrementarNum(numCreciente);
        e.decrementarNum(numDecreciente);
    }

    public void incrementarNum(int numCreciente) {
        while (numCreciente == 0){
            numCreciente =+ 1;
        }
        System.out.println(numCreciente);
    }

    public void decrementarNum(int numDecreciente) {
        while (numDecreciente == 0){
            numDecreciente =- 2;
        }
        System.out.println(numDecreciente);
    }

}
