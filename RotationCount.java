//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        System.out.println(countRotation(arr));
    }
    static int countRotation(int[] arr) {
        int pivot = find_pivot(arr);
//        int pivot = findPivotWithDuplicates(arr);
        return pivot+1;
    }
    static int find_pivot(int[]arr){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if (mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (arr[mid]<=arr[start]){
                end=mid-1;
            }
            else start = mid+1;
        }
        return -1;
    }

    //if array have duplicate elements
    static int findPivotWithDuplicates(int[] arr){
        int start=0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if (mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (arr[mid]==arr[start] && arr[mid]==arr[end]){
                if (arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if (arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if (arr[start]<arr[mid] || arr[start]==arr[mid] && arr[mid]>arr[end]){
                start = mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }
}
