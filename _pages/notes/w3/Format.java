public class Format {

    public static void main(String[] args) {
        int[] lotteryNumbers = {2, 4, 9, 15};
        int year = 2023;
        double inch = 20.3;
        /*
        System.out.printf("Winning numbers are %d %d %d %d \n Congrats! \n", lotteryNumbers[0], lotteryNumbers[1], lotteryNumbers[2], lotteryNumbers[3]);
        System.out.printf("Number is %05d \n", 2023);
        System.out.println("Number is " + 2023);
        System.out.printf("Number is %x\n", year);
        System.out.println("next line");
        */
        double myDouble = 29.782989987592739;


        System.out.printf("Floating point is %.0f\n", myDouble);
        //System.out.printf("Floating point is %.2f\n", myDouble);
        //System.out.printf("inches + %d", (int) inch);

        double pi = 3.14159;
        double y = pi * 30;
        int x  = (int) (pi * 30);
        System.out.println(x);
        System.out.println(y);

        System.out.printf("Division %.3f\n", 76.0/12);
        System.out.println("Integer division " + 76/12);
        System.out.println("Modulo operator " + 76 % 12);
        //System.out.println(76 )
        System.out.println((double) 76/12);
        System.out.println(72 % 2);
        System.out.println(73 % 2);

        int bigNumber = 839382947;
        int right = bigNumber % 100;
        int rounded = bigNumber - (right);
        System.out.println(right);
        System.out.println(rounded);
    }

}