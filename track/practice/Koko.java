public class Koko {

    public static int binarySearch(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (k > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60 };
        int k = 100;
        Koko k1 = new Koko();
        int res = k1.binarySearch(arr, k);
        System.out.println(res);

    }
}
