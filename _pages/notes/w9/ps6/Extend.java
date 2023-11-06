
public class Extend {

    public static void printTable(int numRows, int numCols) {
        for (int i = 1; i <= numRows; i++) {
            printRow(i, numCols);
        }
    }
    public static void printRow(int r, int c) {
        for (int i = 1; i <= c; i++) {
            System.out.print(i*r + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //printTable(5, 5);

        for (int j = 1; j <= 5; j++) {
            for (int i = 1; i <= 10; i++) {
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
        
    }
    
}
