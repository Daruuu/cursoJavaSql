package exerJava25;

public class ArrayWrappers {
    public static void main(String[] args) {
        ArrayWrappers aw = new ArrayWrappers();
        aw.tipoByte();
        System.out.println("--------------------------------------------------");
        aw.tipoShort();
        System.out.println("--------------------------------------------------");
        aw.tipoInt();
        System.out.println("--------------------------------------------------");
        aw.tipoLong();
        System.out.println("--------------------------------------------------");
        aw.tipoFloat();
        System.out.println("--------------------------------------------------");
        aw.tipoDouble();
    }

    public void tipoByte() {
        System.out.println("rango de bytes desde: " + Byte.MIN_VALUE + " hasta: " + Byte.MAX_VALUE);
    }

    public void tipoShort() {
        System.out.println("rango de short desde: " + Short.MIN_VALUE + " hasta: " + Short.MAX_VALUE);
    }

    public void tipoInt() {
        System.out.println("rango de integer desde: " + Integer.MIN_VALUE + " hasta: " + Integer.MAX_VALUE);
    }

    public void tipoLong(){
        System.out.println("rango de long desde: " + Long.MIN_VALUE + " hasta: " + Long.MAX_VALUE);
    }

    public void tipoFloat(){
        System.out.println("rango de float desde: " + Float.MIN_VALUE + " hasta: " + Float.MAX_VALUE);
    }

    public void tipoDouble(){
        System.out.println("rango de double desde: " + Double.MIN_VALUE + " hasta: " + Double.MAX_VALUE);
    }
}

