import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/
//Return indices
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 3, 1};
        int target = 5;
        System.out.println(Arrays.toString( read(arr.length,arr,target)));
    }

    public static int[] read(int n, int[] book, int target) {
        /*brute*/
        /* for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (book[i] + book[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};*/

        /*Optimal, with hashmap*/
        Map<Integer,Integer> hashmap = new HashMap<>();

        for (int i = 0; i <n ; i++) {
            int remTarget = target - book[i];
            if (hashmap.containsKey(remTarget)){
                return new int[]{hashmap.get(remTarget),i};
            }
            hashmap.put(book[i],i);
        }
        return new int[]{-1,-1};
    }
}
