class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public void backTrack(int idx, int[] nums, List<Integer> currSubset) {
        if(idx == nums.length) {
            ans.add(new ArrayList(currSubset));
            return;
        }

        // include current element
        currSubset.add(nums[idx]);
        backTrack(idx + 1, nums, currSubset);

        // skip duplicates
        int i=idx+1;
        while(i < nums.length && nums[i] == nums[i-1]) i++;

        // exclude current element
        currSubset.remove(currSubset.size() - 1);
        backTrack(i, nums, currSubset);
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        backTrack(0, nums, new ArrayList<>());

        return ans;
    }
}