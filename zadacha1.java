// Реализовать алгоритм сортировки слиянием

package Seminar3;


import java.util.Arrays;
import java.util.Random;

public class zadacha1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int n = rnd.nextInt(10);
        int[] arr = new int[n];
        System.out.println(n);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(n);
        }
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, n);
        System.out.println(Arrays.toString(arr));
        
    }   
    public static int[] mergeSort(int[] a, int n) {
        if (n < 2) {
            return a;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] rigth = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = a[i];
        }
        for (int i = mid; i < n; i ++){
            rigth[i - mid] = a[i];
        }
        mergeSort(left, mid);
        mergeSort(rigth, n - mid);

        merge(a, left, rigth, mid, n - mid);
        return a;
     
        
    }
    private static int[] merge(int[] a, int[] l, int[] r, int left, int rigth) {
        int i = 0, j = 0, k = 0;

        while (i < left && j < rigth){
            if (l[i] <= r[j]){
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }            
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (i < left) {
            a[k++] = r[j++];
        }
        return a;
    }
    // private static void SortUnsorted (int[] a, int lo, int hi) {

    //     if (hi <= lo)
    //         return;
    //     int mid = lo + (hi - lo) / 2;
    //     SortUnsorted(a, lo, mid);
    //     SortUnsorted(a, mid + 1, hi);
    
    //     int[] buf = Arrays.copyOf(a, a.length);
    
    //     for (int k = lo; k <= hi; k++)
    //         buf[k] = a[k];
    
    //     int i = lo, j = mid + 1;
    //     for (int k = lo; k <= hi; k++) {
    
    //         if (i > mid) {
    //             a[k] = buf[j];
    //             j++;
    //         } else if (j > hi) {
    //             a[k] = buf[i];
    //             i++;
    //         } else if (buf[j] < buf[i]) {
    //             a[k] = buf[j];
    //             j++;
    //         } else {
    //             a[k] = buf[i];
    //             i++;
    //         }
    //     }
    // }
}
