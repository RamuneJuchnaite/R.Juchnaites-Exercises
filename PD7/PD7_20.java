/**
 * Naudojant Java metodus, parašykite paprasčiausią Java programą ”Atspėk skaičių”.
 */
package lt.techin.pd7;
import java.util.Scanner;

public class PD7_20 {
    public static void main(String[] args) {
        System.out.println("You win ");
    }
    public static int noNumber(int number) {
        int randomNumber = (int) (Math.random() * 100) + 1; // randa random skaiciu
        Scanner scanner = new Scanner(System.in);   // isaukiam scaneri
        System.out.println("Number is between 1-100 "); // ivedam zaidimo tasiykle jog skaiciai 1-100
        System.out.println("You can try 3 times");  // leidziam suvest 3 kart
        int quantityTries = 3; // ivedam 3 kartu vedima kinatmasis

        for (int i = 1; i <= quantityTries; i++) { // suks nuo 1,2 3 kart
              while (number != randomNumber) { // veiks kol musu ivestas skaicius nesutaps su random
               System.out.println("Please enter your number : ");
               int inputNumber = scanner.nextInt();

                if (number == randomNumber) { // kai skaiicius bus = ransom skaiciui tai pasibaigia
                    break;
                }
            }
        }
        return number;
    }
}




