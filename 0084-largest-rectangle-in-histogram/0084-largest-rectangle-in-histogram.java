class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();
        int largest = 0;
        int n = heights.length;

        // Traverse all bars and one extra imaginary bar
        for (int i = 0; i <= n; i++) {

            // Use height 0 at the end to process remaining bars
            int currHeight = (i == n) ? 0 : heights[i];

            // Pop bars while the current height is smaller
            while (!stack.isEmpty() && currHeight < heights[stack.peek()]) {

                // Height of the popped bar
                int height = heights[stack.pop()];

                // calculate width using the previous smaller bar
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;

                // update the maximum rectangle area
                largest = Math.max(largest, height * width);
            }

            // push only valid array indices
            if (i < n) {
                stack.push(i);
            }
        }

        return largest;
    }
}