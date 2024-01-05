package lt.techin;

public class PD3_7 {
    public static void main(String[] args) {

        String Message1 = "Su svetemis sveikinu jus";
        String Message2 = "Su svetemis sveikinu jus visus";
        String Message3 = new String("Su svetemis sveikinu jus");
        String Sum=Message1+Message2;
        String subStr = Message3.substring(5, 16);

        System.out.println(Message2.length());
        System.out.println(Message3.toUpperCase());
        System.out.println(Message3== Message1);
        System.out.println(Sum);
        System.out.println(subStr);



    }
}
