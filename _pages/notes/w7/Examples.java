import java.util.Scanner;

public class Examples {
 
    public static void main(String[] args) {
        
        int x = 7;
        Integer y = 8;

        // using object types 
        String number = "182";

        Integer myNumber = Integer.parseInt(number);
        Double myDouble = Double.parseDouble("2.084");
        // double exampleDouble = (double) "2.084";  // doesn't work!
        System.out.println(myDouble);

        Scanner in = new Scanner(System.in);
        Integer myNumber2 = new Integer(200);

        System.out.println(myNumber2);
        System.out.println(myNumber + 4);

        System.out.println(x);
        System.out.println(y);

    }

}
