
package Arrays;

import java.util.*;

public class AddElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int element = sc.nextInt();

        int index = sc.nextInt();

        int b[] = new int[arr.length + 1];

        for (int i = 0; i < index; i++) {
            b[i] = arr[i];
        }

        b[index] = element;

        for (int i = index; i < arr.length; i++) {
            b[i + 1] = arr[i];
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}