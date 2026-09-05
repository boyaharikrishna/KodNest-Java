package Arrays;
import java.util.*;
public class Palindrome {
    public static void plaindrome(int arr[]){
        boolean palidrome = true;
        for(int i=0;i<arr.length/2;i++){
            if(arr[i] != arr[arr.length-1-i]){
                palidrome = false;
                break;
            }
        }
        if(palidrome){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] =  sc.nextInt();
        }
        plaindrome(arr);
    }
}
