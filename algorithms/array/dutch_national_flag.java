package algorithms.array;

public class dutch_national_flag {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 0, 1, 2, 1, 2, 1, 2, 0, 0, 2, 2, 0, 1, 2, 1, 1, 1, 0 };
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        int t = 0;
        while (mid <= high) {
            if (arr[mid] == 0) {
                t = arr[low];
                arr[low] = arr[mid];
                arr[mid] = t;
                low++;
            }
            if (arr[mid] == 1) {
                mid++;
            }
            if (arr[mid] == 2) {
                t = arr[mid];
                arr[mid] = arr[high];
                arr[high] = t;
                high--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
