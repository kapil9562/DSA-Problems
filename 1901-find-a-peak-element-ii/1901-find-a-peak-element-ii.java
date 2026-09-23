class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int left = 0;
        int right = cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int maxRow = 0;

            for (int r = 1; r < rows; r++) {
                if (mat[r][mid] > mat[maxRow][mid]) {
                    maxRow = r;
                }
            }

            int curr = mat[maxRow][mid];

            int leftValue = mid - 1 >= 0 ? mat[maxRow][mid - 1] : -1;
            int rightValue = mid + 1 < cols ? mat[maxRow][mid + 1] : -1;

            if (curr > leftValue && curr > rightValue) {
                return new int[] { maxRow, mid };
            }

            if (leftValue > curr) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }
}