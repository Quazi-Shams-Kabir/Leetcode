//https://leetcode.com/problems/majority-element/

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 3, 1, 1, 3, 1, 1};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] v) {
        /*brute force will be 2 for loops with a counter integer*/

        /*better will be using hashing, then iterate the hashmap to return the element ,TC = O(N*logN) and SC = O(N)*/
       /* Map<Integer, Integer> map = new HashMap<>();

        for (int i : v) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else map.put(i, 1);
        }
        int majority = v.length / 2;
        for (int i : v){
            if (map.get(i)>majority){
                return i;
            }
        }
        return -1;*/
        /*optimal will be without using map, space complexity will get reduced, TC = O(N) if we don't run the last loop else O(2N) and SC = O(1)*/
        /*Moore's Voting Algo*/

        int count = 0;
        int element = 0;
        /*here we get the potential answer*/
        for (int i = 0; i < v.length; i++) {
            if (count == 0) {
                count = 1;
                element = v[i];
            } else if (v[i] == element) {
                count++;
            } else count--;
        }
        /*here we check again if its majority element, this step is crucial if it says that there might be no majority element
         * otherwise not needed*/
        int count1 = 0;
        for (int j : v) {
            if (j == element) {
                count1++;
            }
            if (count1 > v.length / 2) {
                return element;
            }
        }
        return -1;
    }
}
