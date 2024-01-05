package lt.techin;

import java.util.Scanner;

public class PD4_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite sienos ilgi :");
        String a = scanner.nextLine();
        System.out.println("Iveskite sienos auksti :");
        String h = scanner.nextLine();
        System.out.println("Iveskite plytos kaina :");
        String k = scanner.nextLine();

        int a1 = Integer.parseInt(a);
        int h1 = Integer.parseInt(h);
        double k1 = Double.valueOf(k);
        int s =(a1 * h1);
        int q = s / 200;
        double sum = q * k1;
        System.out.println("Sienos plotis :" + s);
        System.out.println("Jums reikes plytu :" + q);
        System.out.println("Jums kainuos :" + sum);
    }
}