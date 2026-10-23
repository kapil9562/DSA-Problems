class Solution {

    List<List<Integer>> result = new ArrayList<>();


    public void backtrack(int[] nums, List<Integer> currList, boolean[] used) {

        if(currList.size() == nums.length) {
            result.add(new ArrayList(currList));
            return;
        }

        for(int i=0; i<nums.length; i++) {
            if(used[i]) continue;

            currList.add(nums[i]);
            used[i] = true;

            backtrack(nums, currList, used);

            currList.remove(currList.size() - 1);
            used[i] = false;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        backtrack(nums, new ArrayList<>(), new boolean[nums.length]);

        return result;
    }
}