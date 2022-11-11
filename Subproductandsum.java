//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

public class Subproductandsum {
    public static void main(String[] args) {
        int n = 234;
        System.out.println(subtractProductAndSum(n));
    }

    static int subtractProductAndSum(int n) {
        return prodcuctofdigit(n)- sumofdigit(n);
    }

    static int sumofdigit(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            n /= 10;
        }
        return sum;
    }

    static int prodcuctofdigit(int n) {
        int product = 1;
        while (n > 0) {
            int rem = n % 10;
            product = product * rem;
            n /= 10;
        }
        return product;
    }

}
