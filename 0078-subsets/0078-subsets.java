class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public void solve(int idx, List<Integer> currSubset, int[] nums) {
        if (idx == nums.length) {
            ans.add(new ArrayList(currSubset));
            return;
        }

        // include current element
        currSubset.add(nums[idx]);
        solve(idx + 1, currSubset, nums);

        // exclude current element
        currSubset.remove(currSubset.size() - 1);
        solve(idx + 1, currSubset, nums);
    }

    public List<List<Integer>> subsets(int[] nums) {
        solve(0, new ArrayList<>(), nums);

        return ans;
    }
}