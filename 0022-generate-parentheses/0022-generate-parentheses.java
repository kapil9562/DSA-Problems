class Solution {

    List<String> result = new ArrayList<>(); 

    public void generate(int n, int opened, int closed, String curr) {
        if(curr.length() == 2*n) {
            result.add(curr);
            return;
        }

        if(opened < n) {
            generate(n, opened + 1, closed, curr + "(");
        }

        if(closed < opened) {
            generate(n, opened, closed+1, curr + ")");
        }
    }

    public List<String> generateParenthesis(int n) {
        generate(n, 0, 0, "");

        return result;
    }
}