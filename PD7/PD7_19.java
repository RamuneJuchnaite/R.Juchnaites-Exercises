/**
 * Naudojant Java metodus, parašykite paprasčiausią Java programą ”Kūno masės indeksas”.
 */

package lt.techin.pd7;

import java.util.Scanner;
import java.util.logging.Handler;

public class PD7_19 {
    public static void main(String[] args) {
        //double printKmi = kMi(height, kg);
       // System.out.println(printKmi);
    }
    private static double kMi(double height, double kg) {
        double KMI;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter you Height : ");
        height = scanner.nextInt();
        System.out.println("Please enter your weight: ");
        kg = scanner.nextInt();
        KMI = (kg * kg) / (height);

        if (18 < KMI || KMI < 24) {
            System.out.println("You weight is perfect ");
        } else if (KMI < 18) {
            System.out.println("Please eat more");
        } else {
            System.out.println("Please eat less");
        }
        return KMI;
    }
}

