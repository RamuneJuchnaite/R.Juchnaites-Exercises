package lt.techin;

import java.util.Scanner;

public class PD5_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Iveskite kuro bako talpa: ");
        int bakoTalpa = scanner.nextInt();

        System.out.print("Iveskite kuro sanaudas n: ");
        int kuroSanaudos = scanner.nextInt();

        int likutis = bakoTalpa;  // Pradžioje bakas pilnas
        int dienos = 0;  // Pradžioje neįveikta nei viena diena

        while (likutis >= 0) {

            likutis -= (dienos % 2 == 0) ? kuroSanaudos  : kuroSanaudos*2; // ternary
            dienos++;
        }
        System.out.println("Keliauti bus galima " + (dienos) + " dienas.");
    }
}


