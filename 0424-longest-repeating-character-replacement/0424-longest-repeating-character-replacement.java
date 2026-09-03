class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int maxFreq = 0;

        while(right < s.length()) {

            freq[s.charAt(right) - 'A']++;

            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            int replacements = (right-left+1) - maxFreq;

            if(replacements > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right-left+1);

            right++;
        }

        return maxLen;
    }
}