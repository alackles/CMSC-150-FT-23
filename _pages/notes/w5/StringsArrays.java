public class StringsArrays {

    public static void main(String[] args) {
        // code that we want to execute when the program runs should go here
        String name = "Acacia Ackles";
        String firstname = name.substring(0, 6);
        System.out.println(firstname);
        System.out.println(name.length());  // get length
        char myLetter = name.charAt(7);
        System.out.println(name.charAt(4)); // get character at a position
        System.out.println(name.indexOf('c')); // get index of the first appearance of character

        // array examples

        int[] myInts = {2, 3, 4, 5, 8, 0};
        System.out.println("Element: " + myInts[0]);

        String[] courses = {"Intro CS", "Algorithms", "Neural Nets"};
        System.out.println(courses[1]);

        // single-letter string vs. char

        String firstLetterStr = "a";
        char firstLetterChar = 'a';
        //String conversion = firstLetterChar;
        System.out.println(firstLetterChar + 5);
        System.out.println(firstLetterStr + 5);
    }

}