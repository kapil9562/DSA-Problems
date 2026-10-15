class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);


        for(int i=0; i<n * 2; i++) {
            int idx = i % n;

            while(!stack.isEmpty() && nums[idx] > nums[stack.peek()]) {
                ans[stack.pop()] = nums[idx];
            }

            if(i < n) {
                stack.push(idx);
            }
        }

        return ans;
    }
}