class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Traverse the temperatures from left to right
        for (int i = 0; i < n; i++) {

            // compare curr and prev temperatures
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prev = stack.pop();
                ans[prev] = i - prev;
            }

            // push curr temperature index in the stack 
            stack.push(i);
        }

        return ans;
    }
}