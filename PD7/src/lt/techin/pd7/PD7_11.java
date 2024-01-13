/**
 * Parašykite Java metodą, kuris suranda ilgiausią žodį pateiktoje eilutėje.
 */

package lt.techin.pd7;

public class PD7_11 {
    public static void main(String[] args) {
        String text = ("Java is scariest today");
        System.out.println(sentence(text));
            }
            public static String sentence (String text){
            String word =" ", longWord=" " ;

            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) != ' ') {
                    word += text.charAt(i);
                    //System.out.println(word);
                } else {
                    if (word.length() > longWord.length()){
                        longWord = word;
                       // System.out.println(longWord);
                    }
                    word = " ";
                }
            }
                return longWord;

            }
        }


