class Solution {

    public boolean isSafe(int row, int col, int n, char[][] board) {

        // Horizontal
        for (int j = 0; j < n; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // vertical
        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public void saveBoard(char[][] board, List<List<String>> ans) {
        List<String> temp = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            temp.add(new String(board[i]));
        }

        ans.add(temp);
    }

    public void nQueens(char[][] board, List<List<String>> ans, int n, int row) {

        if (row == n) {
            saveBoard(board, ans);
            return;
        }

        for (int j = 0; j < n; j++) {
            if (isSafe(row, j, n, board)) {
                board[row][j] = 'Q';
                nQueens(board, ans, n, row + 1);
                board[row][j] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        nQueens(board, ans, n, 0);
        return ans;
    }
}