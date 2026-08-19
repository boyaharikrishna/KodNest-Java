package Arrays;
import java.util.*;
public class TargetValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        // {10,2,3,1,10,8};
        for(int i=0;i<=arr.length-1;i++){
            arr[i] =sc.nextInt();
        }
        int target = sc.nextInt();
        int count =0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i] == target){
                count++;
            }
        }
        System.out.println(target+":"+count);
    }
}
