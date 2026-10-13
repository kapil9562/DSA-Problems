class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums1.length];

        for(int num : nums2) {
            while(!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }

            stack.push(num);
        }

        for(int i=0; i<nums1.length; i++) {
            if(map.containsKey(nums1[i])) {
                ans[i] = map.get(nums1[i]);
            } else {
                ans[i] = -1;
            }
        }

        return ans;
    }
}