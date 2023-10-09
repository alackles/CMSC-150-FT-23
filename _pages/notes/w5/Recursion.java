public class Recursion {

    public static int sequence(int n) {
        if (n == 0) {
            return 1;
        } else {
            return 2 * sequence(n-1) + 1;
        }
    }
    public static void main(String[] args) {
        int seqnum = sequence(5);
        System.out.println(seqnum);

    }

}
