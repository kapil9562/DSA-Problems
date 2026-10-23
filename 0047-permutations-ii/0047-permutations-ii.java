class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public void backtrack(int[] nums, List<Integer> curr, boolean[] used) {
        if (curr.size() == nums.length) {
            result.add(new ArrayList(curr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue;

            if (i > 0 && nums[i - 1] == nums[i] && !used[i - 1])
                continue;

            curr.add(nums[i]);
            used[i] = true;

            backtrack(nums, curr, used);

            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {

        Arrays.sort(nums);

        backtrack(nums, new ArrayList<>(), new boolean[nums.length]);

        return result;
    }
}