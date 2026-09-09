class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int maxLeft = 0; // 0, 1, 2 
        int maxRight = 0; // 0 , 1, 2, 1, 

        int water = 0; // 0 , -1, -1, 0, 0, 1, 

        while (left < right) {
            if(height[left] < height[right]) {
                maxLeft = Math.max(maxLeft, height[left]);
                water += maxLeft - height[left];
                left++;
            } else {
                maxRight = Math.max(maxRight, height[right]);
                water += maxRight - height[right];
                right--;
            }
        }

        return water;
    }
}