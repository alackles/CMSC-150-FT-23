public class LoopsEx {

    public static int recursiveFactorial(int n) {
        if (n <= 0) {
            return 1;
        } else {
            return n * recursiveFactorial(n-1);
        }
    }

    public static int iterFactorial(int n) {
        int fac = 1;
        int nextNum = 2;
        while (nextNum <= n) {
            fac = fac * nextNum;
            nextNum++;
        }
        return fac;

    }
    
    public static int iterFactorialDown(int n) {
        int fac = n;
        while (n > 1) {
            n = n-1;
            fac = fac * n;
        }
        return fac;

    }
    public static void main(String[] args) {

        int a = 25;
        int b = 19;
        while (a > b) {
            System.out.println(a);
            a--;
            b++;
        }

        int fac1 = recursiveFactorial(6);
        int fac2 = iterFactorial(6);
        int fac3 = iterFactorialDown(6);
        System.out.println(fac1);
        System.out.println(fac2);
        System.out.println(fac3);

        System.out.println("loop: ");

        int total = 0;
        for (int i = 1; i <= 5; i++) {
            total = total + i;
        }
        System.out.println(total);

        

    }
    
}
