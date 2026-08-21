class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        for(int i=0; i<n; i++) {
            int idx = Math.abs(nums[i]) - 1;

            nums[idx] = -Math.abs(nums[idx]);
        }

        for(int i=0; i<n; i++) {
            if(nums[i] > 0) {
                ans.add(i+1);
            }
        }

        return ans;
    }
}