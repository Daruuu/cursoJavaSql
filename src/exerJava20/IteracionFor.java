package exerJava20;

// si el programa llega a la 3ra iteracion (loop) te eche fuera del loop
public class IteracionFor {
    public static void main(String[] args) {
        IteracionFor ite = new IteracionFor();
        ite.loopFOR();
    }

    public void loopFOR() {
        int n = 10;

        for (int i = 0; i < n; i++) {
            if (i == 3)
                break;
            System.out.println("i: " + i);
        }
        System.out.println("loop ha terminado");
    }
}
