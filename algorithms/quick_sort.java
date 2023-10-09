package algorithms;

import java.util.*;

public class quick_sort {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value: ");
            a[i] = sc.nextInt();
        }
        sort(a, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }
    }

    // one way of partition
    // use this way of partition.
    // better way and easy to understand.
    public static int partition(int[] a, int low, int high) {
        int temp;
        int i = low - 1;
        int pivot = a[high];
        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                i++;
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        i++;
        temp = a[i];
        a[i] = pivot;
        a[high] = temp;
        return i;
    }

    // another way of partition
    // public static int partition(int[] a,int low,int high)
    // {
    // int i=low-1;
    // int pivot=high;
    // for(int j=low;j<=high;j++)
    // {
    // if(a[j]<=a[pivot])
    // {
    // i++;
    // int t=a[i];
    // a[i]=a[j];
    // a[j]=t;
    // }
    // }
    // return i;
    // }
    public static void sort(int[] a, int low, int high) {
        if (low < high) {
            int p1 = partition(a, low, high);
            sort(a, low, p1 - 1);
            sort(a, p1 + 1, high);
        }
    }
}