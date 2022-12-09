//geeksforgeeks
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class FindPosiInanInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
//  initial range taken small and later it'll increase exponentially
        int start = 0;
        int end = 1;
//  set up the range where the BS will take place
        while (target>arr[end]){
            int temp=end+1;
            end = end+(end-start+1) * 2;  //doubling the size of array
            start = temp;
        }
        return binarySearch(arr,target,start,end);
    }

    public static int binarySearch(int[] arr, int target,int start,int end){
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target>arr[mid]){
                start=mid+1;
            }
            else if (target<arr[mid]) {
                end=mid-1;
            }
            else return mid;
        }
        return -1;
    }
}
