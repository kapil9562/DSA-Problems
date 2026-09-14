class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        if (p.length() > s.length()) {
            return ans;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (char ch : p.toCharArray()) {
            count1[ch - 'a']++;
        }

        int k = p.length();

        for (int i = 0; i < k; i++) {
            count2[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(count1, count2)) {
            ans.add(0);
        }

        for (int i = k; i < s.length(); i++) {
            count2[s.charAt(i) - 'a']++;

            count2[s.charAt(i - k) - 'a']--;

            if (Arrays.equals(count1, count2)) {
                ans.add(i - k + 1);
            }
        }

        return ans;
    }
}