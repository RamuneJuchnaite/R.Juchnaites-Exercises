//**
* Parašykite Java metodą, kuris priima argumentą ir grąžina jo tipą.
        */

        package lt.techin.pd7;

import java.util.Scanner;

public class PD7_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pateikite teksta: ");
        String stringInput = scanner.nextLine();
        System.out.println("Pateikite logini reiskini (True/false): ");
        boolean booleanInput = scanner.nextBoolean();
        System.out.println("Pateikite sveikaji skaiciu: ");
        int intInput = scanner.nextInt();
        System.out.println("Pateikite float tipo skaiciu: ");
        float floatInput = scanner.nextFloat();
        System.out.println("Pateikite simboli: ");
        char charInput = scanner.next().charAt(0);
        System.out.println(argumentType(stringInput, booleanInput, intInput, floatInput, charInput));
    }

    public static String argumentType(String stringInput, boolean booleanInput, int intInput, float floatInput, char charInput) {
        String box = "";
        System.out.println(stringInput + " - " + stringInput.getClass().getName());

        System.out.println(booleanInput + " - " + ((Object) booleanInput).getClass().getName());
        System.out.println(intInput + " - " + ((Object) intInput).getClass().getSimpleName());
        System.out.println(floatInput + " - " + ((Object) floatInput).getClass().getSimpleName());
        System.out.println(charInput + " - " + ((Object) charInput).getClass().getSimpleName());
        return box;
    }
}
//getSimpleName()
// Grąžina paprastą pagrindinės klasės pavadinimą, nurodytą šaltinio kode.
