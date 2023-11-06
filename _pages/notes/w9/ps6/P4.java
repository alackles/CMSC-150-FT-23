public class P4 {
    
    public static void counter(int x, int y, int k) {
        int current = x;
        while (current <= y + k -1) {
            System.out.print(current + " ");
            current += k;
        }
        System.out.println();
    }
    public static void altCounter(int x, int y, int k) {
        int i = x;
        for (i = x; i < y; i += k) {
            System.out.print(i + " ");
        }
        System.out.println(i);
    }

    public static void main(String[] args) {
        counter(2, 20, 3);
        counter(2, 19, 3);
        //counter ()
        altCounter(5, 70, 22);
        altCounter(2, 20, 3);
    }

}
