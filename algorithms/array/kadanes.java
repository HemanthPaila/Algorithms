package algorithms.array;

public class kadanes {

    public static void main(String[] args) {
        int[] arr = new int[] { -2, 3, 2, 1 };
        int maxi = arr[0];
        int global = arr[0];
        for (int i = 0; i < 4; i++) {
            maxi = Math.max(arr[i] + maxi, arr[i]);
            global = Math.max(maxi, global);
        }
        System.out.println(global);
    }
}
