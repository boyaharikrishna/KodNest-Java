package TwoDArray;

import java.util.*;

public class TotalSum {
    public static void main(String[] args) {
        // 246 135
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int total = 0;
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                total = total + arr[i][j];
            }
            System.out.println();
        }
System.out.println(total);
    }
}