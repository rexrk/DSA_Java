public class Sudoku {
    public static void main(String[] args) {
        int[][] board = {
                {2, 1, 3},
                {1, 0, 0},
                {0, 0, 1}
        };

        sudokuSolver(board);
    }

    static void sudokuSolver(int[][] board) {
        helper(board, 0, 0);
    }

    static void helper(int[][] board, int r, int c) {
        if (r == board.length) {
            display(board);
            return;
        }

        if (c == board.length) {
            r++;
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (board[r][c] == 0) {
                if (isSafeNum(board, r, i)) {
                    board[r][c] = c + 1;
                }
            }
            helper(board, r, c + 1);
            board[r][c] = 0;

        }


    }

    private static boolean isSafeNum(int[][] board, int r, int c) {
        //row
        for (int i = 0; i < r; i++) {
            if (board[r][c] == board[i][c]) {
                return false;
            }
        }

        //col
        for (int i = 0; i < c; i++) {
            if (board[r][c] == board[r][i]) {
                return false;
            }
        }

        return true;

    }

    private static void display(int[][] board) {
        for (int[] b : board) {
            for (int n : b) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

        System.out.println("---------------");
    }


}
