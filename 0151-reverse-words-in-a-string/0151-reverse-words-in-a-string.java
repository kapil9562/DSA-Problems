class Solution {
    public String reverseWords(String s) {
        int right = s.length() - 1;

        StringBuilder ans = new StringBuilder();

        while (right >= 0) {
            while (right >= 0 && s.charAt(right) == ' ') {
                right--;
            }

            if (right < 0)
                break;

            int left = right;

            while (left >= 0 && s.charAt(left) != ' ') {
                left--;
            }

            if (ans.length() > 0) {
                ans.append(" ");
            }

            ans.append(s.substring(left + 1, right + 1));

            right = left - 1;
        }

        return ans.toString();
    }
}