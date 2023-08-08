//https://leetcode.com/problems/subarray-sum-equals-k
import java.util.*;
public class CountSubArraysSumK {
    public static void main(String[] args) {
        
    }
    public static int findAllSubarraysWithGivenSum(int arr[], int s) {
        int n = arr.length;
        int prefixSum = 0, count = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int index = 0; index < n; index++) {

            prefixSum += arr[index];

            int remove = prefixSum - s;

            count +=map.getOrDefault(remove, 0);

            map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}
