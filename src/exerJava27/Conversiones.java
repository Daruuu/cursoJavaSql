package exerJava27;

public class Conversiones {
    public static void main(String[] args) {
        Conversiones c = new Conversiones();
        c.doubleToByte();
        c.byteToDouble();
    }
    public void doubleToByte(){
        double numDouble = Double.MAX_VALUE;
        System.out.println(numDouble);
        float numFloat = (float) numDouble;
        System.out.println( "double to float: "+ numFloat);
        long numLong = (long) numDouble;
        System.out.println("double to long: " +numLong);
        int numInt = (int) numDouble;
        System.out.println("double to int: " +numInt);
        short numShort = (short) numDouble;
        System.out.println("double to short: " + numShort);
        byte numByte = (byte) numDouble;
        System.out.println(" double to byte: " + numByte);
    }

    public void byteToDouble(){
        byte numByte = Byte.MAX_VALUE;
        System.out.println(numByte);
        short numShort = numByte;
        System.out.println("byte to short: " + numShort);
        int numInt = numByte;
        System.out.println("byte to int: " + numInt);
        long numLong = numByte;
        System.out.println("byte to long: " + numLong);
        float numFloat = numByte;
        System.out.println( "byte to float: " + numFloat);
        double numDouble = numByte;
        System.out.println("byte to double: " + numByte);

    }
}
