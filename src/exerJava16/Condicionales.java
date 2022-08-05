package exerJava16;

import java.sql.SQLOutput;

public class Condicionales {
    int randomNumber = (int) Math.round(Math.random()); //generamos un random number between 0 OR 1

    public static void main(String[] args) {
        Condicionales c = new Condicionales();
        System.out.println("IF UNIDIRECTIONAL:");
        System.out.print( c.randomNumber + " == ");
        c.ifUnidirectional();
        System.out.println("--------------------------------");
        System.out.println("IF-ELSE DIRECCIONAL:");
        System.out.print( c.randomNumber + " == ");
        c.ifElseDirectional();
        System.out.println("--------------------------------");
        System.out.println("OPERATOR TERNARY:");
        System.out.print( c.randomNumber + " == ");
        boolean bool =  c.randomNumber == (int) Math.round(Math.random()); //pasamos de integer a BOOLEAN
        System.out.println(bool);

    }
    public void ifUnidirectional(){
        if (randomNumber == 0) {
            System.out.println("red");
        }if (randomNumber == 1) {
            System.out.println("black");
        }
    }
    public void ifElseDirectional(){
        if (randomNumber == 0) {
            System.out.println("red");
        }else {
            System.out.println("black");
        }
    }




}
