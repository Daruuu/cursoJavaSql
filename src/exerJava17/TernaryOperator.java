package exerJava17;

public class TernaryOperator {
    public static void main(String[] args) {
        int number = -9;

        if (number > 0) {
            System.out.println("¡Es positivo!");
        } else if (number < 0) {
            System.out.println("¡Es negativo!");
        } else {
            System.out.println("¡Es cero, na de ná!");
        }
        String result = (number > 0) ? "¡Es positivo!" : "¡Es negativo!";
        System.out.println(result);
    }


}
