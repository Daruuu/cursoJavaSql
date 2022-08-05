package exerJava18;

public class TreeLoops {
    public static void main(String[] args) {
        char ast = '*';

        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < 10 - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (i * 2); k++)
                System.out.print(ast);
            System.out.println();
        }
    }
}
