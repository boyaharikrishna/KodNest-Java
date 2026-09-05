package Arrays;

public class OddEven {
    public static void main(String[] args) {
        int arr[] = {6,4,2};
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 != 0){
              System.out.println(arr[i]);
            }
        }
        
    }
}
