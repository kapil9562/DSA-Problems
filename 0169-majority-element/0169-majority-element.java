class Solution {
    public int majorityElement(int[] nums) {
        // Map<Integer, Integer> map = new HashMap<>();
        // int n = nums.length;

        // for(int i=0; i<n; i++) {
        //     if(map.containsKey(nums[i])) {
        //         map.put(nums[i], map.get(nums[i])+1);
        //     } else {
        //         map.put(nums[i], 1);
        //     }
        // }

        // int count = 0;
        // int ele = 0;

        // for(int i : map.keySet()) {
        //     if(count<map.get(i)) {
        //         count = map.get(i);
        //         ele = i;
        //     }
        // }

        // return ele;

        int count = 0;
        int ele = 0;

        for(int num: nums) {
            if(count == 0) {
                ele = num;
            }

            if(ele == num) {
                count++;
            } else {
                count--;
            }
        }

        return ele;
    }


}