
public class Aside {

    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 8, 9, 20, 4};
        String[] names = {"Joe", "Kurt", "Acacia"};

        for (int i = 0; i < arr.length; i++) {
            int square = arr[i] * arr[i];
            System.out.println(square);
        }

        for (int elem : arr) {
            System.out.println(elem);
        }

        for (String name : names) {
            System.out.println(name);
        }

    }
    
}
