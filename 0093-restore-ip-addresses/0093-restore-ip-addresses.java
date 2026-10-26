class Solution {

    List<String> result = new ArrayList<>();

    public void backtrack(String s, int idx, int count, List<String> parts) {
        if(count == 4) {
            if(idx == s.length()) {
                result.add(String.join(".", parts));
            }
            return;
        }

        for(int len=1; len<=3 && len+idx <= s.length(); len++) {
            String part = s.substring(idx, idx+len);

            if(part.length() > 1 && part.charAt(0) == '0') {
                break;
            }

            if(Integer.parseInt(part) > 255) {
                break;
            }

            parts.add(part);
            backtrack(s, idx+len, count+1, parts);
            parts.remove(parts.size() - 1);
        }
    }

    public List<String> restoreIpAddresses(String s) {
        backtrack(s, 0, 0, new ArrayList<>());

        return result;
    }
}