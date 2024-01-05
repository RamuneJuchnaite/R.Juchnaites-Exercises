package lt.techin;

public class PD3_6 {
    public static void main(String[] args) {
        int a = 5;
        Integer b= new Integer(a);
        System.out.println(a);

        int num1= Integer.valueOf(10);
        int num2=Integer.valueOf(30);
        Integer result=num1+num2;
        System.out.println(result);

        short c=10;
        short d = new Short (c);
        System.out.println(c);
        short wrapperaShort = Short.MIN_VALUE;
        System.out.println(wrapperaShort);


    }
}