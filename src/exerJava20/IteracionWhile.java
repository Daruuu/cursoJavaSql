package exerJava20;

public class IteracionWhile {
    public static void main(String[] args) {
        IteracionWhile iter = new IteracionWhile();
        iter.loopWHILE();
    }

    public void loopWHILE() {
        int i = 1;

        while (i < 6) {
            if (i == 3) {
                break;
            }
            System.out.println("iteracion" + i);
            i++;
        }
        System.out.println("sale en la iteracion: " + i);
    }


}
