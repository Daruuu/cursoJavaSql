package exerJava20;

public class IteracionWhile {
    public static void main(String[] args) {
        IteracionWhile iter = new IteracionWhile();
        iter.loopWHILE();
    }

    public void loopWHILE() {
        int i = 0;
        while (i < 6) {
            System.out.println("iteracion" + i);
            if (i == 3) {
                System.out.println("programa termina en loop " + i );
                break;
            }
            i++;
        }
    }


}
