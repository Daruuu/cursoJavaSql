package exerJava21;
//1. haz una funcion llamada javaOrNull() y que si le pasamos java como parametro retorne JAVA
// y encaso contrario NULL
public class JavaNull {
    public static void main(String[] args) {
        JavaNull jn = new JavaNull();
        jn.javaOrNull("JAVA");
    }

    public void javaOrNull(String str){
        if (str.equals("JAVA")){
            System.out.println("JAVA");
        }else {
            System.out.println("null");;
        }
    }


}
