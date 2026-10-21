class Solution {

    public void solve(int n, String str, List<String> ans) {
        if(str.length() == n) {
            ans.add(str);
            return;
        }

        solve(n, str + "1", ans);

        if(str.isEmpty() || str.charAt(str.length() - 1) != '0') {
            solve(n, str + "0", ans);
        }
    }

    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();

        solve(n, "", ans);

        return ans;
    }
}