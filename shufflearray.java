//https://leetcode.com/problems/shuffle-the-array/

import java.util.Arrays;

public class shufflearray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n=3;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }
    static int[] shuffle(int[] nums, int n) {
        /*
        int[] ans=new int[n*2];
//adding the even indexes
        for (int i = 0,j=0; i < n; i++,j=j+2) {
            ans[j]=nums[i];
        }
//adding the odd indexes
        for (int i = n,j=1; i <2*n ; i++,j=j+2) {
            ans[j]=nums[i];
        }
//or
//        for (int i = 0; i < n; i++) {
//            ans[2 * i] = nums[i];
//            ans[2 * i + 1] = nums[n + i];
//        }
        return ans;
         */

        /* IN PLACE */
        int len = nums.length;

/*
 storing two values(Xn,Yn) as one int is possible by multiplying it with a value more than max of two given numbers and adding the other number, retrieving will be just modulo of the number is one element, division of the number is the other element
 for storing value I'm using 1024, as given constraint is 1 <= nums[i] <= 10^3, so 1000 can be highest possible element, and 1024>1000
 why not 1001?
 ans will be desired, but 1024 is power of two(2^),hence easier to perform bitwise operation
 as all operations are performed in bit
*/
        for(int i = n; i < len;  i++){
            // storing Xn and Yn together on the right side of the array, to later set them at correct index
            nums[i] = (nums[i]*1024) + nums[i-n];
        }

// here we know all the elements are on the right halved of the array, even the left halved ones too,
// we just have to retrieve it and store accordingly
        int index = 0;
        for(int i = n ; i < len; i++,index+=2){
            nums[index] = nums[i] % 1024;
            nums[index+1] = nums[i] / 1024;
        }

        return nums;
    }
}
