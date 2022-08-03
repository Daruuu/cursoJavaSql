package exerJava11;

public class Incrementar {
    int numero = 0;
    float num = 1;

    public static void main(String[] args) {
        Incrementar e = new Incrementar();
        e.incrementarNum();
        e.decrementarNum();
    }

    public void incrementarNum() {
        while (numero == 0){
            numero =+ 1;
        }
        System.out.println(numero);
    }

    public void decrementarNum() {
        while (num == 0){
            num =- 4;
        }
        System.out.println(numero);
    }

}
