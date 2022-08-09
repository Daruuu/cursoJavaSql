package exerJava18;

public class TreeLoops {
    public static void main(String[] args) {
        char ast = '*';

        for (int i = 0; i <= 10; i++) { // numero de lineas
            for (int j = 0; j < 10 - i; j++)    // numero de espacios
                System.out.print(" ");
            for (int k = 0; k < (i * 2); k++)   // numero de asteriscos
                System.out.print(ast);
            System.out.println();
        }

    }
/*
    public void treeComplete(){
        for (int i = 0; i < 12; i++) {
            //Imprimiendo el número de espacios
            if (i<10){
                for (int j = 0; j < 12 - i; j++) {
                    System.out.print(" ");
                }
                //Imprimiendo el número de estrellas
                for (int k = 0; k < (2 * i + 2); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }else {
                for (int l = 0; l < 11; l++) {
                    System.out.print(" ");
                }
                for (int z = 0;z<1;z++){
                    System.out.println("**");
                }

            }
        }
    }

 */
}
