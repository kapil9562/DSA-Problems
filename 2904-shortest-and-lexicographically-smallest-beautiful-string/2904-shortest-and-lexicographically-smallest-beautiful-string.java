class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left = 0;
        int ones = 0;
        String ans = "";

        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) == '1') {
                ones++;
            }

            while (ones > k) {
                if (s.charAt(left) == '1') {
                    ones--;
                }
                left++;
            }

            if (ones == k) {

                while (s.charAt(left) == '0') {
                    left++;
                }

                String curr = s.substring(left, right + 1);

                int l1 = ans.length();
                int l2 = curr.length();

                if (ans.equals("") || l2 < l1 || (l1 == l2 && curr.compareTo(ans) < 0)) {
                    ans = curr;
                }
            }
        }

        return ans;
    }
}