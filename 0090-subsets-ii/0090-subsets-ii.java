class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public void backTrack(int idx, int[] nums, List<Integer> currSubset) {
        ans.add(new ArrayList(currSubset));

        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[i - 1]) {
                continue;
            }

            currSubset.add(nums[i]);
            backTrack(i + 1, nums, currSubset);

            currSubset.remove(currSubset.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        
        backTrack(0, nums, new ArrayList<>());

        return ans;
    }
}