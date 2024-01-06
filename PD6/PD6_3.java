package lt.techin;

import java.util.Arrays;

public class PD6_3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] newarray = new int[6];

        for (int i = 0; i < array.length; i++) {
            newarray[i] = array[i];
        }
        System.out.println(Arrays.toString(newarray));
    }
}
//
//    String sentence [] = {"I", "love", "to", "use", "Java"};
//System.out.println(sentence[0] + " " + sentence[1]+ " " + sentence[2]+ " " + sentence[3]+ " " + sentence[4]);
//        }




