package exerJava15;
import java.util.Scanner;

public class BlancoNegro {
    public static void main(String[] args) {

        int randomNumber = (int) Math.round(Math.random()); //generamos un random number between 0 OR 1
        boolean bool = randomNumber == (int) Math.round(Math.random()); //pasamos de integer a BOOLEAN

        String  result =  bool ? "white" : "black";    //TERNARY OPERATOR
        System.out.println("random number => " + randomNumber);
        System.out.println("result in boolean => " + result);
    }

    /*
    public double numRandom() {
        for (int i = 0; i < 1; i++) {
            double randomNum = Math.random();
            System.out.println(randomNum);
        }
        return 0;
    }*/
}
