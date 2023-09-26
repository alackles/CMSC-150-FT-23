import java.util.Scanner;

public class Convert {

    public static void main(String[] args) {

            final double CONVERSION_RATE = (9.0/5.0) + 32;
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a temperature in Celsius: ");
            double c = input.nextDouble();
            double f = c * CONVERSION_RATE;
            System.out.print("Example %.3f ");
            System.out.printf("Your teperature is %.3f \n", f);
            System.out.printf("Check %.2f", 2.0/3.0);
    }
}
