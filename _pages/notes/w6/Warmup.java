import java.util.Scanner;

public class Warmup {

    public static void printLarger(int x, int y) {
        System.out.print("Larger number is: ");
        if (x > y) {
            System.out.print(x + "\n");
        } else if (x < y) {
            System.out.print(y + "\n");
        } else {
            System.out.print("neither.\n");
        }
    }

    public static void main(String[] args) {

        // taking input
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter two integers a and b. I will display the larger integer.");
        
        System.out.print("a: ");
        int a = in.nextInt();

        System.out.print("b: ");
        int b = in.nextInt();

        // give output
        printLarger(a, b);

    }

}