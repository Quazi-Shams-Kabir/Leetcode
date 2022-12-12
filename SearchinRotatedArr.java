//https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class SearchinRotatedArr {
    public static void main(String[] args) {
        int[] nums = {3,1};
        int target = 1;
        System.out.println(search(nums,target));
    }
    static  int search(int[] nums, int target) {
            int pivotAns=pivot(nums);
            if (pivotAns==-1){
                return binary_search(nums,target,0, nums.length-1);
            }
            if (nums[pivotAns]==target){
                return pivotAns;                                                 //we can call it recursively
            }
            if (target>=nums[0]){
            return binary_search(nums,target,0,pivotAns-1);
            }
            return binary_search(nums,target,pivotAns+1, nums.length-1);
    }
    static int pivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (mid>start&&arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if (mid<end&&arr[mid]>arr[mid+1]){
                return mid;
            }
            if (arr[mid]<=arr[start]){
                end=mid-1;
            }
            else start=mid+1;
        }
        return -1;
    }
    //in case of duplicate elements
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
    static int binary_search(int[] arr, int target,int start, int end) {
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target>arr[mid]){
                start = mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }
            else return mid;
        }
        return -1;
    }
}
