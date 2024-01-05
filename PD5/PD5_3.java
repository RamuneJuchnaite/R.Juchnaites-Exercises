package lt.techin;

import java.util.Scanner;
public class PD5_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int i;
int number;
int count;
        System.out.println(" Pirminis skaicius : ");

        for(number = 1; number >= 1; number++) {
            count = 0;
            for (i = 2; i <= number/2; i++) {
                while (number % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && number != 1 ){
                System.out.print(number + " ");
            }
        }
    }
}

//    Scanner scanner = new Scanner(System.in);
//        System.out.println("Iveskite skaiciu n :");
//                // int n = scanner.nextInt();
//                int n;
//                int count;
//                for (int i = 2; i <= n; i++){ // PRADEDAM nuo 2 nes 1 atmetam
//                if (n % i == 0 || n == 0|| n == 1) // liekana 0 bus dalinant sveikuosius is 2
//                count = 0;
//                //System.out.println("Ne pirminis skaicius" + n1);
//                break;
////                }
//                System.out.println("Pirminis skaicius " + i);
//                }
//                }








