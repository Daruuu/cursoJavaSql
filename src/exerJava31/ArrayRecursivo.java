package exerJava31;

public class ArrayRecursivo {
    public static void main(String[] args) {
        String[] tecnologias = {"Markdown", "Regexp", "HTML", "CSS", "JS", "SQL", "Java"};

        ArrayRecursivo ar = new ArrayRecursivo();
        ar.recorrerArray(tecnologias);
        System.out.println("----------------------------------");
        ar.iterateArray();
        System.out.println("--------------------------------");
        ar.fibonacciIterativo();
        System.out.println("--------------------------------");
        int recursivo = 10;
        for (int i = 0; i < recursivo; i++) {
            System.out.println(fibonacciRecursivo(i));
        }
    }

    public void recorrerArray(String[] array) {
        for (String arrString : array) {
            System.out.println(arrString);
        }
    }

    //recorrer array de forma recursiva
    public void arrayRecursividad() {

    }

    //recorrer array hasta llegar a HTML
    public void iterateArray() {     //iterar hasta HTML
        String[] tecnologias = {"Markdown", "Regexp", "HTML", "CSS", "JS", "SQL", "Java"};
        for (int i = 0; i < tecnologias.length; i++) {
            while (i <= 2) {
                System.out.println(tecnologias[i]);
                i++;
            }
        }
    }

    public void fibonacciIterativo() {
        int totalFibonaci = 10;
        int num1 = 0;
        int num2 = 1;
        int suma = 1;
        System.out.println(num1);
        for (int i = 1; i < totalFibonaci; i++) {
            System.out.println(suma);
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }
    }

    public static int fibonacciRecursivo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
    }
}
