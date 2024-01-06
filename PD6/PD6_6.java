package lt.techin;

public class PD6_6 {
    public static void main(String args[]) {
        int mas[] = {8, 9, 10, 13, 15};
//        System.out.println("Indeksas \t Reiksme");
//        for (int indeksas = 0; indeksas<mas.length; indeksas++) {
//            System.out.println(indeksas +"\t"+ mas[indeksas]);
//        }
        for (int elementas : mas){
            System.out.print (" "+ elementas+ " ");
        }

    }
}

