package lt.techin;
import java.util.Scanner;

public class PD5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite skaiciu :");
        String a = scanner.nextLine();
        int a1 = Integer.parseInt(a);

        int i = 1;
        for (a1 = 1; a1 <= 10; a1++) {
            for (i = 1; i <= 10; i++) {
                System.out.print ((a1 * i)+"\t");
            }
            System.out.println();
                 }
    }
}







