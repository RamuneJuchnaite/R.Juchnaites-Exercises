package lt.techin;

import java.util.Scanner;

public class PD5_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

int n ;
int count =0;
                do {
                    System.out.println("Iveskite skaiciu :" );
                     n = scanner.nextInt();
                     count = count + n;

                                   }while (n != 0);

                System.out.println("Ivestas skaiciu suma " + count);

    }
}

