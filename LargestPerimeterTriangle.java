//https://leetcode.com/problems/largest-perimeter-triangle/

public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        int[] nums = {2,1,2};
        System.out.println(largestPerimeter(nums));
    }
    static int largestPerimeter(int[] nums) {
        insertionSort(nums);
        int perimeter=0;
        for (int i = 0; i <=nums.length-3 ; i++) {
            if (checkIf(nums[i],nums[i+1],nums[i+2])){
                perimeter = Math.max(perimeter,nums[i]+nums[i+1]+nums[i+2]);
            }
        }
        return perimeter;
    }
    static boolean checkIf(int a,int b,int c){
        return a + b > c && a + c > b && b + c > a;
    }
    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {   //i should run N-2 times coz j will be i+1, and it'll give index out of bound error
            for (int j = i+1; j >0 ; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else break;
            }
        }
    }
    static void swap(int[] arr, int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
