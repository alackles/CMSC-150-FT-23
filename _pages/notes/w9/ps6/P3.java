import java.util.Scanner;
public class P3 {
   
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.nextLine();
        System.out.println(word);

        
        int len = word.length();
        for (int i = 0; i < len; i++) {
            System.out.println(word.charAt(i));
        }
        *


    }
}
