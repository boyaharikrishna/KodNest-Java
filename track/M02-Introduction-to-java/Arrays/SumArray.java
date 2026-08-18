package Arrays;
import java.util.*;
public class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int sum = 0;
        System.out.println("Enter Array Elements:");
        for(int i=0;i<=a.length-1;i++){
            a[i] =sc.nextInt();
        }
        for(int i=0;i<=a.length-1;i++){
            sum = sum + a[i];
        }
        System.out.println("Toatal Sum: " +sum);
    }
}
