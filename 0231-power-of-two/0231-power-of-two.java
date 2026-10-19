class Solution {
    public boolean isPowerOfTwo(int n) {

        // ====== using bit manipulation ======
        return n > 0 && (n & (n-1)) == 0;


        // ====== using recursion ======

        // if (n == 1)
        //     return true;
        // if (n <= 0 || n % 2 != 0)
        //     return false;

        // return isPowerOfTwo(n / 2);
    }
}