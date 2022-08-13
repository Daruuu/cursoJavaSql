package exerJava31;

public class ArrayRecursivo {
    public static void main(String[] args) {
        ArrayRecursivo ar = new ArrayRecursivo();
        ar.iterateArray();
    }
    public static void recorrerArray(String[] array){
        for (String arrString: array) {
            System.out.println(arrString);
        }

    }

    public void arrayRecursividad(){

    }

    public void iterateArray(){     //iterar hasta HTML
        String[] tecnologias = {"Markdown","Regexp", "HTML", "CSS", "JS", "SQL", "Java"};
        for (int i = 0; i < tecnologias.length; i++) {
            while (i <= 2) {
                System.out.println(tecnologias[i]);
                i++;
            }
        }
    }
}
