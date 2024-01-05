package lt.techin;

import java.util.Scanner;

public class PD4_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite automobilio greiti km/h :");
        String v = scanner.nextLine();
        double v1 = Double.valueOf(v);

        double hours = 264 / (v1 * 100);
        double hours1 = hours * 360;

        System.out.println("Automobilis vaziuoja s :" + hours1);


    }
}
