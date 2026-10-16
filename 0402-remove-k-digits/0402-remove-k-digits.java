class Solution {
    public String removeKdigits(String num, int k) {

        if (k == num.length())
            return "0";

        StringBuilder stack = new StringBuilder();

        for (char ch : num.toCharArray()) {
            while (k > 0 && stack.length() > 0 && stack.charAt(stack.length() - 1) > ch) {
                stack.deleteCharAt(stack.length() - 1);
                k--;
            }

            stack.append(ch);
        }

        stack.setLength(stack.length() - k);

        int i = 0;
        while (i < stack.length() && stack.charAt(i) == '0') {
            i++;
        }

        String result = stack.substring(i);

        return result.length() > 0 ? result : "0";
    }
}