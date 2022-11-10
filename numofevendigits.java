//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class numofevendigits {
    public static void main(String[] args) {
        int[] nums = {0};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int count =0;
//        for (int i = 0; i < nums.length; i++) {
//            if (isEven(digit2(nums[i]))){
//            count++;
//            }
//        }
        for (int num : nums) {
            if (isEven(num)) {
                count++;
            }
        }
        return count;
    }
    static boolean isEven(int num){
        return digit(num)%2==0;
    }

    static int digit (int num){
        if (num<0){
            num = num*-1; //to convert neg num. into positive
        }
        return (int)(Math.log10(num))+1;    //to return digit
    }

    //or
    static int digit2 (int num){
        int count=0;
        if (num==0){
            return 1;
        }
        if (num<0){
            num = num*-1; //to convert neg num. into positive
        }
        while (num>0){
            num=num/10;
            count++;
        }
        return count;

    }
}
