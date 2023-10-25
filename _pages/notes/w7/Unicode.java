import java.util.Scanner;

public class Unicode {

    public static void unicode_shift(String word, int shift) {
        for (int i = 0; i < word.length(); i++) {
            Character current = word.charAt(i);
            Integer charAsInteger = current + shift ;
            //System.out.println(charAsInteger);
            String s =  Character.toString(charAsInteger);
            System.out.print(s);
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String inputWord = in.nextLine();
        unicode_shift(inputWord, 7);
    }

}