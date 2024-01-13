/**
 * Parašykite Java metodą, kuris skaičiuoja trikampio plotą.
 */

package lt.techin.pd7;

public class PD7_3 {
    public static void main(String[] args) {
        System.out.println(TriangleS(10,10));
    }
    public static int TriangleS(int trikampioPagrindas, int trikampioAukstis){
        return (trikampioPagrindas * trikampioAukstis)/2;
    }
}

