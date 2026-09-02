package Arrays;

import java.util.*;

public class NewElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];
        System.out.println("Enter 5 array elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the new element:");
        int newElement = sc.nextInt();

        System.out.println("Enter the index where you want to insert:");
        int index = sc.nextInt();

        for (int i = 5; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = newElement;

        System.out.println("Updated array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
