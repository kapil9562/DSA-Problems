class Solution {

    public int sumOfSquares(int num) {
        if (num == 0) {
            return 0;
        }

        int digit = num % 10;

        return digit * digit + sumOfSquares(num / 10);
    }

    public boolean isHappy(int n) {

        int slow = n;
        int fast = sumOfSquares(n);

        while (fast != 1 && slow != fast) {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
        }

        return fast == 1;
    }
}