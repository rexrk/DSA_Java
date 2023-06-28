public class NKnights {
    public static void main(String[] args){
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knightsPlacer(board, 0);
    }

    static void knightsPlacer(boolean[][] board, int r){
        if(r == board.length){
            display(board);
            return;
        }

        for(int c = 0 ; c < board[r].length; c++){
            if(isSafe(board, r, c)){
                board[r][c] = true;
                knightsPlacer(board, r+1);
                board[r][c] = false;
            }
        }


    }

    private static boolean isSafe(boolean[][] board, int r, int c) {
        //left
        if(c > 1 && r > 0){
            if(board[r-1][c-2]){
                return false;
            }
        }


        //right
        if(c < board.length - 2 && r > 0){
            if(board[r-1][c+2]){
                return false;
            }
        }

        //above right
        if(r >= 2 && c < board.length - 1){
            if(board[r-2][c+1]){
                return false;
            }
        }

        //above left
        if(r >= 2 && c > 0){
            return !board[r - 2][c - 1];
        }

        //else
        return true;


    }

    private static void display(boolean[][] board) {
        for(boolean[] b : board){
            for(boolean el : b){
                if(el){
                    System.out.print("K " );
                } else
                    System.out.print("- ");
            }
            System.out.println();
        }
        System.out.println("------------");

    }
}
