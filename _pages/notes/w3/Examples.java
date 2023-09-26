import java.util.Scanner;

public class Examples {

    public static void main(String[] args) {
        System.out.println(System.out);
        System.out.println(System.out);

        Scanner input = new Scanner(System.in);
        int myNumber = 7;
        String name = input.nextLine();
        System.out.println("You wrote: " + name);
        int mynumber = input.nextInt();
        System.out.println(mynumber * 20);
    }
}