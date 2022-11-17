//https://leetcode.com/problems/find-the-highest-altitude/

import java.util.Arrays;

public class highestalti {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    static int largestAltitude(int[] gain) {
//        int[] sum = new int[gain.length];
//        sum[0]=gain[0];
//        for (int i = 1; i < gain.length; i++) {
//            sum[i]=sum[i-1]+gain[i];
//        }
//        return max(sum);

//        or
        int[] sum = new int[gain.length+1];
        sum[0]=0;
        int max=sum[0];
        for (int i = 1; i < sum.length; i++) {
            sum[i]=sum[i-1]+gain[i-1];
            if (sum[i]>max){
                max = sum[i];
            }
        }
        return max;
    }
    static int max(int[] sum){
        int result=0;
        for (int j : sum) {
            if (j > result) {
                result = j;
            }
        }
        return result;
    }
}
