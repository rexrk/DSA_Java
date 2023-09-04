public class NQueens {
    public static void main(String[] args) {
        int n = 6;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }

    static int queens(boolean[][] board, int r) {
        if (r == board.length) {
            display(board);
            return 1;
        }

        int count = 0;

        for (int c = 0; c < board.length; c++) {
            if (isSafe(board, r, c)) {
                board[r][c] = true;
                count += queens(board, r + 1);
                board[r][c] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int r, int c) {
        //vertical above check
        for (int i = 0; i < r; i++) {
            if (board[i][c]){
                return false;
            }
        }

        //diagonal left check
        int maxLeft = Math.min(r, c);
        for(int i = 1; i <= maxLeft; i++){
            if(board[r-i][c-i]){
                return false;
            }
        }

        //diagonal right check
        int maxRight = Math.min(r, board.length - 1 - c);
        for(int i = 1; i <= maxRight; i++){
            if(board[r-i][c+i]){
                return false;
            }
        }

        return true;
    }


    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean el : row) {
                if (el) {
                    System.out.print("Q ");
                } else
                    System.out.print("- ");
            }
            System.out.println();
        }
        System.out.println("------------");
    }
}
