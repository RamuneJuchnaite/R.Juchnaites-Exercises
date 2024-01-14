/**
 * Naudojant Java metodus, parašykite paprasčiausią Java programą ”Kūno masės indeksas”.
 */

package lt.techin.pd7;

import java.util.Scanner;
import java.util.logging.Handler;

public class PD7_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter you Height : ");
        double heighTInput = scanner.nextInt();
        System.out.println("Please enter your weight: ");
       double kgInput = scanner.nextInt();

        System.out.println(kMi(heighTInput,kgInput));
    }
    private static double kMi(double height, double kg) {
        double KMI;
        KMI = (kg * kg) / (height);

        if (18 < KMI && KMI < 24) {
            System.out.println("You weight is perfect ");
        } else if (KMI < 18) {
            System.out.println("Please eat more");
        } else {
            System.out.println("Please eat less");
        }
        return KMI;
    }
}

