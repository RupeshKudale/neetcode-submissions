class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int r=0; r<9; r++) {
            for(int c=0; c<9; c++) {
                if(board[r][c] != '.' && !isValid(r, c, board)){
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isValid(int r, int c, char[][] board){
        for(int i=0; i<9; i++) {

            if(r != i && board[r][c] == board[i][c]) return false;
            if(c != i && board[r][c] == board[r][i]) return false;

            int newRow = 3*(r/3) + (i/3);
            int newCol = 3*(c/3) + (i/3);
            if(newRow == r && newCol == c) continue;
            else if(board[r][c] == board[newRow][newCol]) return false;
        }
        return true;
    }
}
