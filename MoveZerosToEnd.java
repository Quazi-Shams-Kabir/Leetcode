//https://leetcode.com/problems/move-zeroes/

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
//        moveZeroes(arr);
        moveZerosOptimal2(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroes(int[] a) {
        int n = a.length;
        for (int i = 0, j = 1; (i < n) && (j < n); ) {
            if (a[i] == 0 && a[j] != 0) {
                swap(a, i, j);
                i++;
                j++;
            } else if (a[i] != 0 && a[j] == 0) {
                i++;
                j++;
            } else if (a[i] == 0 && a[j] == 0) {
                j++;
            } else if (a[i] != 0 && a[j] != 0) {
                i++;
                j++;
            }
        }
    }
    public static void moveZerosOptimal2(int[] a) {
        int n = a.length;
//placing j pointer to the first zero element
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }
//if no zero, return
        if (j == -1) {
            return ;
        }
//using two pointers, swap with non-zero element
        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                swap(a,i,j);
                j++;
            }
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
