class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<numRows; i++) {
            List<Integer> row = new ArrayList<>();
            
            // add first element
            row.add(1);

            // add middle elements
            for(int j=1; j<i; j++) {
                row.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
            }

            // add last element
            if(i > 0) {
                row.add(1);
            }

            ans.add(row);
        }

        return ans;
    }
}