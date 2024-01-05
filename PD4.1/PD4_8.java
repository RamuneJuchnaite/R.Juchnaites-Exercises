import java.util.Scanner;

public class PD4_8 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite kiekvienos dienos paskaitu skaiciu :");
      //  String lessonQuant = scanner.nextLine();
        int monday = scanner.nextInt();
        int tuesday = scanner.nextInt();
        int wednesday = scanner.nextInt();
        int thursday = scanner.nextInt();
        int friday = scanner.nextInt();

        int sumLessons = monday+tuesday+thursday+wednesday+friday ;
        System.out.println("Turite šia savaite paskaitu:" + sumLessons);

        int lessomHour = sumLessons * 45;
        System.out.println("Skirete laiko paskaitoms s=" + lessomHour);

    }
}
