package exerJava17;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        SwitchCase s = new SwitchCase();
        s.intToStringSwitch();

    }

    public void intToStringSwitch() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num > 0 && num <= 9) {
            switch (num) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("introduce un numero del 1 al 9");
            }
            break;
        }
    }
}
