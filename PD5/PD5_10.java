package lt.techin;

import java.util.Scanner;

public class PD5_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite n : ");
        int start = scanner.nextInt();
        System.out.println("Iveskite m : ");
        int end = scanner.nextInt();
        for (int i = start; i <= end; i++) {

            if ((i % 3 == 0) && (i % 10 != 3)) {
                System.out.println(i);
            }
        }
    }
}


