package lt.techin;

public class PD4_5 {
    public static void main(String[] args){

        int num1 = 10;
        int num2 = 20;
        num1 = num2;
        System.out.println("num1 = " + num1);
        num1 += num2;
        System.out.println("num1 = " + num1);
        num1 -= num2;
        System.out.println("num1 = " + num1);
        num1 *= num2;
        System.out.println("num1 = " + num1);
        num1 /= num2;
        System.out.println("num1 = " + num1);
        num1 %= num2; // ima skaiciu po kableio jei nelyginis
        System.out.println("num1 = " + num1);
    }
}
