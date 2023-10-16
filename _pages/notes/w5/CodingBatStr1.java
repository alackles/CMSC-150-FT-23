public class CodingBatStr1 {

    public static String firstHalf(String str) {
        int strlen = str.length();
        int halfway = strlen/2;
        return str.substring(0, halfway);
    }

    public static void main(String[] args) {

        String newstring = firstHalf(args[0]);
        System.out.println(newstring);
        //System.out.println(args[1]);

    }

}