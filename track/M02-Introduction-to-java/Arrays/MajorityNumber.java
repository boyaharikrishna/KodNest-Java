package Arrays;
import java.util.Scanner;
public class MajorityNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = 1;
        int value = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i] == value){
                count++;
            }else{
                count--;
            }
        
        if(count==0){
            value = arr[i];
            count = 1;
        }
    }
    System.out.print(value);
    }
}
