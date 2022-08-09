package exerJava21;

public class RandFunction {
    public static void main(String[] args) {
        RandFunction rf = new RandFunction();
        System.out.println(rf.randomFunction(4));
        System.out.println(rf.randomFunction(9));
    }

    public boolean randomFunction(int numero){
        while (numero % 2 == 0){
            return true;
        }
        return false;
    }
}
