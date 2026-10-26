class Solution {

    List<String> result = new ArrayList<>();

    public void backtrack(String s, int idx, int parts, String curr) {
        if(parts == 4) {
            if(idx == s.length()) {
                result.add(curr.substring(0, curr.length() - 1));
            }
            return;
        }

        for(int len=1; len<=3 && len+idx <= s.length(); len++) {
            String segment = s.substring(idx, idx+len);

            if(segment.length() > 1 && segment.charAt(0) == '0') {
                break;
            }

            if(Integer.parseInt(segment) > 255) {
                break;
            }

            backtrack(s, idx+len, parts+1, curr + segment + ".");
        }
    }

    public List<String> restoreIpAddresses(String s) {
        backtrack(s, 0, 0, "");

        return result;
    }
}