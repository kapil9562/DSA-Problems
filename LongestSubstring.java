import java.util.*;

class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[128];
        Arrays.fill(last, -1);

        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (last[c] >= left) {
                left = last[c] + 1;
            }

            last[c] = right;
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        LongestSubstring s = new LongestSubstring();

        int result = s.lengthOfLongestSubstring("abcabacc");

        System.out.println(result);
    }
}