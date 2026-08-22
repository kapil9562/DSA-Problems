class Solution {

    public int digitSum(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public int digitProduct(int n) {
         int product = 1;

        while (n > 0) {
            product *= n % 10;
            n /= 10;
        }

        return product;
    }

    public boolean checkDivisibility(int n) {
        int sum = digitSum(n);
        int product = digitProduct(n);

        return n % (sum + product) == 0;
    }
}