class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for (int num : nums) {
            set.add(num);
        }

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currCount = 0;
                while (set.contains(num)) {
                    currCount++;
                    num++;
                }

                count = Math.max(currCount, count);
            }
        }

        return count;
    }
}