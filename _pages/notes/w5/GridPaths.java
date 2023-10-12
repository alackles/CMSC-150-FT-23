public class GridPaths {

    public static int gridPaths(int m, int n) {
        if (n == 1 || m == 1) {
            return 1;
        } else {
            return gridPaths(m-1, n) + gridPaths(m, n-1);
        }
    }
    public static void main(String[] args) {
        int numPaths = gridPaths(10, 10);
        System.out.println(numPaths);
    }

}