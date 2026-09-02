package TwoDArray;
import java.util.*;
public class SchoolProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][][] = new int[3][3][5];
       for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            for(int k=0;k<5;k++){
                arr[i][j][k] = sc.nextInt();
            }
        }
       }
       for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            for(int k=0;k<5;k++){
                System.out.print(arr[i][j][k]+" ");
            }
            System.out.println();
        }
        System.out.println();
       }
    }
}
