package lt.techin;

public class PD6_5 {
    public static void main(String[] args) {
        int massyv[] = {10, 9, 8, 7, 6, 5, 4};
        int min = massyv[0];
        int max = massyv[0];

               for (int i = 0; i < massyv.length; i++) { // lyginam su pasyvo ilgiu (kiek elementu)
            if (max < massyv[i]) {
                max = massyv[i];

            }
           if (massyv[i] < min) {
            min = massyv[i];

        }
    }
            System.out.println("Maziausia reiksme "+ min);
            System.out.println("Didziausi reiksme "+ max  );
}
}




