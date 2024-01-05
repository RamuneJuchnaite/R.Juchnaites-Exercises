package lt.techin;

import java.util.Scanner;

public class PD4_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kiek zuvu gyvena akvariume :");
        String b = scanner.nextLine();
        System.out.println("Kiek žuvų į akvariumą įdedama kiekvieną dieną?  :");
        String z = scanner.nextLine();
        System.out.println("Kiek dienų praėjo?   :");
        String d = scanner.nextLine();
        int z1 = Integer.parseInt(z);
        int d1 = Integer.parseInt(d);
        int b1 = Integer.parseInt(b);

        int quantF = z1 * d1;
        int sum = b1 + quantF;

        System.out.println("Dabar turime zuvyciu  :" + sum);

    }

}
