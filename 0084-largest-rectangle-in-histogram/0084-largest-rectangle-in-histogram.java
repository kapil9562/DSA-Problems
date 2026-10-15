class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int largest = 0;

        int n = heights.length;

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[i] <= heights[stack.peek()]) {
                int popedIdx = stack.pop();

                if (stack.isEmpty()) {
                    int area = heights[popedIdx] * i;
                    largest = Math.max(largest, area);
                } else {
                    int area = heights[popedIdx] * (i - stack.peek() - 1);
                    largest = Math.max(largest, area);
                }
            }

            stack.push(i);
        }

        int i = n;

        while (!stack.isEmpty()) {
            int popedIdx = stack.pop();

            if (stack.isEmpty()) {
                int area = heights[popedIdx] * i;
                largest = Math.max(largest, area);
            } else {
                int area = heights[popedIdx] * (i - stack.peek() - 1);
                largest = Math.max(largest, area);
            }
        }

        return largest;
    }
}