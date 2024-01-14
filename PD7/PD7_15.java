/**
 * Parašykite Java metodą, kuris skaičių masyve suranda antrąjį mažiausią ir antrąjį didžiausius skaičius.
 */

package lt.techin.pd7;

import java.util.Arrays;

public class PD7_15 {
    public static void main(String[] args) {
        int[] numberArray = {1, 20, 30, 40, 8, 9, 100, 7};

        System.out.println(Arrays.toString( myArray(numberArray)));
          }
    public static int[] myArray (int[] numberArray) {

        Arrays.sort(numberArray);

        int size = numberArray.length;
        int first = numberArray[1];
        int last = numberArray[size - 2];
        System.out.println("Antras maziausias : " + first);
        System.out.println("Antras didziausias  : " + last);
        return numberArray;
    }
}

