package algorithms.array;

public class two_pointer {

    public static void main(String[] args) {
        // Given an sorted array and search the key presented in the array
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            // Based on a condition increment low or decrement high
            low++;
            high--;
        }
        System.out.println("end");
    }

}
