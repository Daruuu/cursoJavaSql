package exerJava16;

import java.util.Scanner;

public class TemperaturaCategory {
    public static void main(String[] args) {
        TemperaturaCategory t = new TemperaturaCategory();
        t.temperaturaIf();
        System.out.println("=======================");
        t.temperaturaIfElse();
    }

    public void temperaturaIf(){
        Scanner sc = new Scanner(System.in);
        double temperatura = sc.nextDouble();
        if (temperatura < 5){
            System.out.println("Clima frios\nTipo Polar");
        }if (temperatura >=5 && temperatura < 10){
            System.out.println("Climas frios\nTipo Alta montaña");
        }if (temperatura >= 10 && temperatura < 13.5){
            System.out.println("Climas templados\nTipo Oceanico");
        }if (temperatura >= 13.5 && temperatura < 16.5) {
            System.out.println("Climas templados\nTipo Mediterraneo");
        }if (temperatura >= 16.5 && temperatura < 20) {
            System.out.println("Climas templados\nTipo Continental");
        }if (temperatura >= 23.5 && temperatura < 26.5) {
            System.out.println("Climas calidos\nTipo Ecuatorial");
        }if (temperatura >= 23.5 && temperatura < 26.5) {
            System.out.println("Climas calidos\nTipo Tropical");
        }if (temperatura >= 26.5) {
            System.out.println("Climas calidos\nTipo Desertico");
        }
    }

    public void temperaturaIfElse(){
        Scanner sc = new Scanner(System.in);
        double temperatura = sc.nextDouble();
        if (temperatura < 5){
            System.out.println("Clima frios\nTipo Polar");
        }else if (temperatura >=5 && temperatura < 10){
            System.out.println("Climas frios\nTipo Alta montaña");
        }else if (temperatura >= 10 && temperatura < 13.5){
            System.out.println("Climas templados\nTipo Oceanico");
        }else if (temperatura >= 13.5 && temperatura < 16.5) {
            System.out.println("Climas templados\nTipo Mediterraneo");
        }else if (temperatura >= 16.5 && temperatura < 20) {
            System.out.println("Climas templados\nTipo Continental");
        }else if (temperatura >= 23.5 && temperatura < 26.5) {
            System.out.println("Climas calidos\nTipo Ecuatorial");
        }else if (temperatura >= 23.5 && temperatura < 26.5) {
            System.out.println("Climas calidos\nTipo Tropical");
        }else {
            System.out.println("Climas calidos\nTipo Desertico");
        }
    }
}
