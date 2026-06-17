import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int remain = target-nums[i];

            if(map.containsKey(remain)) {
                return new int[]{map.get(remain), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] agrs) {
        int[] nums = {1,2,3,4,5,6};
        int target = 4;
        Solution sol = new Solution();
        int[] result = sol.twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }
}