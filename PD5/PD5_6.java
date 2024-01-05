package lt.techin;

import java.util.Scanner;

public class PD5_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiek atvezete egluciu : ");
        int treequant = scanner.nextInt();
       double count = 0;
        //int n =0;
        int test =0;
        do {
            test +=1;
            System.out.println("Iveskite egluciu aukscius :");
            int n = scanner.nextInt();
            count = count + n;
           System.out.println("Bendra suma " + count);
;        } while (test != treequant);  // daryti cikla kol bus =

      System.out.println("Egluciu vidutinis aukstis " + count / treequant); //KAZKAS cia blogai

    }
}






