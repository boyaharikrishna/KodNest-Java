package Arrays;

public class SpaceProblem {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 6, 5, 5, 5, 8 };
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(arr[i]);
        }

    }
}