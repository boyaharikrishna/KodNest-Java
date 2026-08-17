package Arrays;

import java.util.Scanner;

public class UsingArraysFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("enter array Elements:");
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
         System.out.println("enter array Elements are:");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
