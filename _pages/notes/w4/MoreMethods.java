import java.lang.Math;

public class MoreMethods {
   
    public static void hello() {
        int x = 2;
        int y = 4;
        int z = 20;
        System.out.println("Hello");
        System.out.println(x + y);
    }

    public static void add(double x, double y) {
        System.out.printf("%.2f \n", x + y);
        int z = 30;
        //System.out.println(z);  // doesn't work b/c z is not defined
    }

    public static double circleArea(double r) {
        double area = Math.PI * r * r;
        return area;
    }

    public static double sphereVolume(double r) {
        return (4.0/3.0) * circleArea(r) * r;
    }

    public static boolean isEven(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        /*
        hello();
        add(2.9, 48.0);
        System.out.println(z);
        double first = 283.4;
        double second = 83.2;
        add(first, second);
        */
        double area = circleArea(5);
        System.out.println(area);
    }
}
