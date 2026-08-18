package Arrays;
import java.util.*;
public class MaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] =  new int[5];
        System.out.println("Enter the Array Elements: ");
        for(int i=0;i<=arr.length-1;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array elements are: ");
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }
        int max = arr[0];
        int min = arr[0];
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i] > max){
                max = arr[i];
            }else{
                min = arr[i];
            }
        }
        System.out.println("The Max Value is : "+ max);
        System.err.println("The min value is: " +min);
    }
}
