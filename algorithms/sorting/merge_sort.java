package algorithms.sorting;

import java.util.*;

public class merge_sort {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value: ");
            a[i] = sc.nextInt();
        }
        divide(a, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }
    }

    public static void conqure(int a[], int si, int mid, int ei) {
        int merge[] = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int i = 0;
        while (idx1 <= mid && idx2 <= ei) {
            if (a[idx1] <= a[idx2]) {
                merge[i++] = a[idx1++];
            } else {
                merge[i++] = a[idx2++];
            }
        }
        while (idx1 <= mid) {
            merge[i++] = a[idx1++];
        }
        while (idx2 <= ei) {
            merge[i++] = a[idx2++];
        }
        for (int x = 0, j = si; x < merge.length; x++, j++) {
            a[j] = merge[x];
        }
    }

    public static void divide(int a[], int si, int ei) {
        if (si >= ei)
            return;
        int mid = (si + ei) / 2;
        divide(a, si, mid);
        divide(a, mid + 1, ei);
        conqure(a, si, mid, ei);
    }
}