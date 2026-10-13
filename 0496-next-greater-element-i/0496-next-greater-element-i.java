class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums1.length];

        // Find the next greater element for each number in nums2
        for(int num : nums2) {

            // If the current number is greater than the stack's top,
            // it is the next greater element for the popped number
            while(!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }

            // Push the current number onto the stack
            stack.push(num);
        }

        // Find the next greater element for each number in nums1
        for(int i=0; i<nums1.length; i++) {

            // If a next greater element exists, retrieve it from the map
            if(map.containsKey(nums1[i])) {
                ans[i] = map.get(nums1[i]);
            } else {
                // If no greater element exists, assign -1
                ans[i] = -1;
            }
        }

        return ans;
    }
}