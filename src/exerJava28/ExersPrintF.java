package exerJava28;

public class ExersPrintF {
    public static void main(String[] args) {
        ExersPrintF ef = new ExersPrintF();
        ef.exerciseOne();
        ef.exerciseTwo();
        ef.exerciseThree();
        ef.exerciseFour();
        ef.exerciseFive();
        ef.exerciseSix();
    }
    // Ejercicio 1: System.out.printf("", "NOMBRE", "APELLIDO1", "APELLIDO2");
    // Devuelva el contenido en el siguiente formato (son tabulaciones) NOMBRE	APELLIDO1	APELLIDO2

    public void exerciseOne() {
        System.out.printf("%s\t %s\t %S %n", "nombre", "apellido1", "apellido2");
        //System.out.printf("%20s%20s%20s%n", "Nombre ", "Director", "Año");
    }

    // Ejercicio 2:  System.out.printf("", "NOMBRE", "apellido1", "apellido2");
    // Devuelva el contenido en el siguiente formato  (son espacios) NOMBRE	apellido1	apellido2

    public void exerciseTwo() {
        System.out.printf("%12s %s%S %n", "nombre", "apellido1", "apellido2");
    }

    // Ejercicio 3:(son espacios) apellido2, apellido1, Nombre

    public void exerciseThree() {
        System.out.printf("%3$s %2$S %1$s", "nombre", "apellido1", "apellido2");
    }

    // Ejercicio 4: System.out.printf("", "22"); Devuelva el contenido en el siguiente formato (dejar espacios) "        22"
    public void exerciseFour() {
        System.out.printf("%n%5d%n", 22);
    }

    // Ejercicio 5: System.out.printf("", "22"); Devuelva el contenido en el siguiente formato (dejar ceros):   "0000000022"
    public void exerciseFive() {
        System.out.printf("%08d%n", 22);
    }

    // Ejercicio 6: System.out.printf("", "17.1829327"); Devuelva el contenido: (dejar ceros):   "000017.18"
    public void exerciseSix() {
        System.out.printf("%06f%n", 17.1829327);
        System.out.printf("%020.2f%n", 1.1234);
    }

}
