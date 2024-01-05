package lt.techin;

import java.util.Scanner;

public class PD4_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite puodeliu skaiciu :");
        String a = scanner.nextLine();
        int a1 = Integer.parseInt(a);
        //double a2 = Double.valueOf(a1);

        int puod = a1 / 3;
        System.out.println("Supakuota puodeliu:" + puod);
        String b = scanner.nextLine();

        int nepuod = a1 % 3 ;

        System.out.println("Nesupakuota puodeliu:" + nepuod);
        //String c = scanner.nextLine();
    }
}










