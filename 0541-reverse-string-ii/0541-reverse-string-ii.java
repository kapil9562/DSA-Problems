class Solution {
    public String reverseStr(String s, int k) {
        char[] ans = s.toCharArray();

        for(int i=0; i < ans.length; i += 2*k) {
            int left = i;
            int right = Math.min(i+k-1, s.length() - 1);

            while(left < right) {
                char temp = ans[left];
                ans[left] = ans[right];
                ans[right] = temp;

                left++;
                right--;
            } 
        } 

        return new String(ans);
    }
}