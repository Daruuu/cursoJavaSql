package PRINTF;

import java.util.ArrayList;

public class PrintF {
    public static void main(String[] args) {
        /***
         * printf -> Se utiliza para dar formato a la salida en la consola. Valores aceptados:
         * ---------------------------------------------------------------------
         *
         * Secuencias de escape:
         * ---------------------------------------------------------------------
         * \n Nueva linea
         * \t tabulador horizontal
         * \r Retorno de carro (es como pulsar la tecla de quitar un espacio siempre y que lo haya en dicha línea claro)
         * \\ Para escribir barra diagonal inversa
         * \" para escribir una doble comilla
         * Caracteres de conversión:
         * ---------------------------------------------------------------------
         * %s Se utilizar para referimos a los Strings (textos) sin importar si estan en mayusculas o minusculas
         * %S Se utilizar para referimos a los Strings (textos) exclusivamente en mayuscula
         * %c Se utiliza para referirnos a un caracter unicode sin importar que este este en mayuscula o minusculas
         * %C Se utiliza para referirnos a un caracter unicode exclusivamente en mayuscula
         * %d Se utiliza para referirnos a numeros enteros, es decir, sin decimales, base decimal
         * %f Se utiliza para a un numero real (de tipo double o float) con punto fijo. Por ejemplo 13.141516
         * %n Se utiliza para crear nueva linea.
         * %t Se utiliza para realizar una tabulacion horizontal
         * %r Se utiliza para backspace (retorno de carro) es como pulsar la tecla de quitar un espacio siempre y que lo haya en dicha línea claro
         * %% Se utiliza para añadir un % al mensaje de la consola
         */

        // Trabajando con un solo valor
        System.out.printf("%s%n", "Hola"); //Hola
        System.out.printf("%S%n", "hola"); //HOLA
        System.out.printf("%d%n", 10); //10
        System.out.printf("%d%n", 1234); //1234
        System.out.printf("%f%n", 10.1234); //10.123400
        System.out.printf("%.2f%n", 10.1234F); //10.12
        System.out.printf("%.3f%n", 10.1234); //10.123

        System.out.printf("\"%s\"%n", "Hola"); //"Hola"


        // Añadiendo contenido al valor
        System.out.printf("%d = cinco%n", 5); //5 = cinco
        System.out.printf("%+d%n", 10); //+10
        System.out.printf("%+d%n", 10); //+10
        System.out.printf("%d%%%n", 20); //20%

        /***
         * Cuando no utiliazmos dolares estamos utilizando el orden correlativo. Primero la variable 1, después a la variable 2...
         * Si queremos seleccionar una variable en concreto realizamos lo siguiente:
         * 		%1$ Nos permite indicar que queremos hacer referencia a la PRIMERA variable. Debe ir seguida del tipo por ejemplo %1$s para un String
         * 		%2$ Nos permite indicar que queremos hacer referencia a la SEGUNDA variable. Debe ir seguida del tipo por ejemplo %1$s para un String
         */
        // Trabajando con varios valores a la vez
        System.out.printf("%s%f%n", "PI=", 3.141516); //PI=3.141516
        System.out.printf("%s%.2f%n", "PI=", 3.141516); //PI=3.14
        System.out.printf("%s%f%n", "PI=", 3.141516); //PI=3.141516
        System.out.printf("%s%.2f%n", "PI=", 3.141516); //PI=3.14
        System.out.printf("%2$f%1$s%n", "=PI", 3.141516); //3.141516=PI
        System.out.printf("%3$S, %2$s, %1$s%n", "NOMBRE", "APELLIDO1", "APELLIDO2"); //APELLIDO2, APELLIDO1, NOMBRE
        System.out.printf("%1$d x %1$d = %2$d%n", 5, 5*5); //5 x 5 = 25;
        System.out.printf("%1$.2f x %1$.2f = %2$.2f%n", 1.1234, 1.1234*1.1234); //1.12 x 1.12 = 1.26

        /***
         * Existe la posibilidad de dejar espacio en blanco para por ejemplo formatear un fichero.
         * Para ello, utilizamos:
         * 		%10f Completando el resto de valores con espacios.
         * 		%010f Completando el resto de valores con 0.
         */
        System.out.printf("%+10.2f%n", 1.1234); //Ocupamos 10 espacios en total. Como solo tenemos 4 digitos los otros 6 serán espacios. Por lo que el resultado sera:      +1.12
        System.out.printf("%8.2f%n", 1.1234); //Ocupamos 8 espacios en total. Como solo tenemos 6 digitos los otros 2 serán espacios. Por lo que el resultado sera:  1.1234
        System.out.printf("%020.2f%n", 1.1234); //Ocupamos 20 espacios en total. Como solo tenemos 4 digitos los otros 16 serán 0. Por lo que el resultado sera:00000000000000001,12
        System.out.printf("%020.2f%n", 1.1234); //Ocupamos 20 espacios en total. Como solo tenemos 4 digitos los otros 16 serán 0. Por lo que el resultado sera:00000000000000001,12
        System.out.printf("%10s%n", "Total:"); //Ocupamos 10 espacios en total. Como solo tenemos 6 digitos dejamos 4 espacios a la izquierda
        System.out.printf("%-10s%n", "Total:"); //Ocupamos 10 espacios en total. Como solo tenemos 6 digitos dejamos 4 espacios a la derecha "Total:    "

        // Ejercicio 1: Haz que la siguiente instrucción: System.out.printf("", "NOMBRE", "APELLIDO1", "APELLIDO2"); Devuelva el contenido en el siguiente formato (son tabulaciones) NOMBRE	APELLIDO1	APELLIDO2
        // Ejercicio 2: Haz que la siguiente instrucción: System.out.printf("", "NOMBRE", "apellido1", "apellido2"); Devuelva el contenido en el siguiente formato  (son espacios) NOMBRE	apellido1	apellido2
        // Ejercicio 3: Haz que la siguiente instrucción: System.out.printf("", "Nombre", "apellido1", "apellido2"); Devuelva el contenido en el siguiente formato  (son espacios) apellido2, apellido1, Nombre
        // Ejercicio 4: Haz que la siguiente instrucción: System.out.printf("", "22"); Devuelva el contenido en el siguiente formato (dejar espacios) "        22"
        // Ejercicio 5: Haz que la siguiente instrucción: System.out.printf("", "22"); Devuelva el contenido en el siguiente formato (dejar ceros):   "0000000022"
        // Ejercicio 6: Haz que la siguiente instrucción: System.out.printf("", "17.1829327"); Devuelva el contenido: (dejar ceros):   "0000000022"
        // Ejercicio 7: Haz que la siguiente instrucción: System.out.printf("", "Hola ", "Mundo"); Devuelva el contenido: "HolaMudo (utiliza retornos de carros)
        ArrayList<Pelicula> peliculasList = new ArrayList<Pelicula>();
        // Añadiendo alumnos al arrayList
        peliculasList.add(new Pelicula("Pulp Fiction", "2002", "Tarantino"));
        peliculasList.add(new Pelicula("Kill Bill", "2005", "Tarantino"));
        peliculasList.add(new Pelicula("Rocky", "2007", "Silvestre Stalonne"));

        System.out.printf("%20s%20s%20s%n", "Nombre ", "Director", "Año");
        System.out.println("\t-----------------------------------------------------------");
        for (Pelicula pelicula : peliculasList) {
            System.out.printf("%20s%20s%20s%n", pelicula.titulo, pelicula.anyo, pelicula.director);
        }

        System.out.printf("%-20s%-20s%-20s%n", "Nombre ", "Director", "Año");
        System.out.println("-----------------------------------------------------------");
        for (Pelicula pelicula : peliculasList) {
            System.out.printf("%-20s%-20s%-20s%n", pelicula.titulo, pelicula.anyo, pelicula.director);
        }
    }

    public static class Pelicula{
        String titulo = "";
        String anyo = "";
        String director = "";

        public String getTitulo() {
            return titulo;
        }
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
        public String getAnyo() {
            return anyo;
        }
        public void setAnyo(String anyo) {
            this.anyo = anyo;
        }
        public String getDirector() {
            return director;
        }
        public void setDirector(String director) {
            this.director = director;
        }
        public Pelicula(String titulo, String anyo, String director) {
            super();
            this.titulo = titulo;
            this.anyo = anyo;
            this.director = director;
        }



    }
}