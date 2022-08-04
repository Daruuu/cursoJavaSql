package exerJava15;
import java.util.Scanner;
public class ParOImpar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParOImpar p = new ParOImpar();

        System.out.print("introduce numero random:");
        int numeroInput = sc.nextInt();

        p.parImpar(numeroInput);
    }

    public void parImpar(int numero){
        if (numero % 2 == 0) {
            System.out.println("par");
        }else {
            System.out.println(" no es par");
        }
    }
}
