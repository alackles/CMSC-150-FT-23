public class MultTable {

    public static void printRow(int base, int numCols) {
        for (int i = 1; i < numCols; i++) {
             System.out.printf("%4d", base * i);
        }
        System.out.println();
    }
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            printRow(i, 7);
        }

    }
}