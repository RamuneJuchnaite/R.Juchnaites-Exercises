package lt.techin;

import java.util.Scanner;

public class PD5_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiek autobusu vyksta kasdien : ");
        int busQuant = scanner.nextInt();

        int number = 0;
        int countpassengerNum = 0;
        int countHour = 0;
        int countMin = 0;
        int passengerNum = 0;
       // int passengerNum1 = 0;
        int busHour = 0;
        int busMinut = 0;
        int d =0 ;


        for (int i = 1; i <= busQuant; i++) {
            number += 1; // numeracija autobuso
            System.out.println(number + " Autobuso vaziavimo laikas (h) : ");
            busHour = scanner.nextInt();
            System.out.println(number + " Autobuso vaziavimo laikas (MIN) : ");
            busMinut = scanner.nextInt();
            System.out.println(number + " Autubusas paveza keleiviu : ");
            passengerNum = scanner.nextInt();
            countpassengerNum = countpassengerNum + passengerNum;
            countHour = countHour + busHour; //sudedam visas valandas
            countMin = countMin + busMinut; // sudedam visas minutes

            if (passengerNum < 10) // jei autobus maziau nei 10 keleiviu , nurodo autubusu skaiciu
            {

              d++;

              // System.out.println(" Keleiviu maziau nei 10 zmoniu , autobuse " + number);

            } else {
                System.out.println(" Keleiviai virsijo 10 zmoniu skaiciu");
            }
        }
            System.out.println("Bendras keleiciu skaicius " + countpassengerNum);
            System.out.println("Vidutinis sugaistas laikas min " + (countHour * 60 + countMin) / busQuant);
            System.out.println("Maziau nei 10 keleiviu buvo autobuse " + d); // nepaima autobuso nr
        }
    }









