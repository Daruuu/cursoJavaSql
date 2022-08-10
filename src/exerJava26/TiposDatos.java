package exerJava26;

public class TiposDatos {

    public static void main(String[] args) {
        Long l1 = 40000L;
        byte b1 = 90;
        short s1 = 2000;    //Min value is -32,768 Max value is 32,767
        int num1 = 1750;
        Integer numeroWrapper = Integer.valueOf(num1);
        System.out.println(numeroWrapper);
    }
}
