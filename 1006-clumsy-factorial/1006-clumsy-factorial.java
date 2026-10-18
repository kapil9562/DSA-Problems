class Solution {

    public int clumsy(int n) {

        // ============== observation-based solution ===============
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(n == 3) return 6;
        if(n == 4) return 7;

        if(n % 4 == 0) return n + 1;
        if(n % 4 == 1 || n % 4 == 2) return n + 2;
        return n - 1;

        // =========== without extra memory =============

        // int sum = 0;
        // int curr = n;
        // int operator = 0;

        // n--;

        // while(n > 0) {
        //     if(operator == 0) {
        //         curr *= n;
        //     } else if(operator == 1) {
        //         curr /= n;
        //     } else if(operator == 2) {
        //         sum += curr;
        //         curr = n;
        //     } else {
        //         sum += curr;
        //         curr = -n;
        //     }

        //     operator = (operator + 1) % 4;
        //     n--;
        // }

        // return curr + sum;

        // ===================== using stack =====================

        // if (n == 0 || n == 1) {
        //     return n;
        // }

        // Stack<Integer> stack = new Stack<>();
        // int operator = 0;

        // while (n > 0) {
        //     if (!stack.isEmpty()) {
        //         if (operator < 2) {
        //             if (operator == 0) {
        //                 stack.push(stack.pop() * n);
        //             } else {
        //                 stack.push(stack.pop() / n);
        //             }
        //         } else if (operator == 2) {
        //             stack.push(n);
        //         } else {
        //             stack.push(-n);
        //         }

        //         operator = (operator + 1) % 4;
        //     } else {
        //         stack.push(n);
        //     }
        //     n--;
        // }

        // int sum = 0;

        // while (!stack.isEmpty()) {
        //     sum += stack.pop();
        // }

        // return sum;
    }
}