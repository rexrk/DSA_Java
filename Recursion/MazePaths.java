import java.util.ArrayList;
import java.util.Arrays;

class MazePaths {
    public static void main(String[] args) {
        //1st Method
//        path("", 3, 3);

        //2nd Method
//        System.out.println(pathString("", 3, 3)); //2.

        //3rd Method
//        allPaths("", 3, 3);

        //4th Method
//        avoidObstacles("" , 3, 3);

        //4th Alternative with boolean array
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
//        avoidObstacles("", 0, 0, board ) ;

        //5th Method (OverFlow)
//        allDirections("", 3, 3);

        //5th Method (with backtrack)
//        allDirections("", 0, 0, board);

        //6th Method (printing path in matrix)
        int[][] path = new int[board.length][board.length];
        allDirections(board, 0, 0, path, 1);

    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            path(p + "D", r - 1, c);
        }
        if (c > 1) {
            path(p + "R", r, c - 1);
        }

    }

    static ArrayList<String> pathString(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> down = new ArrayList<>();
        ArrayList<String> right = new ArrayList<>();

        if (r > 1) {
            down = pathString(p + 'D', r - 1, c);
        }
        if (c > 1) {
            right = pathString(p + 'R', r, c - 1);

        }

        down.addAll(right);
        return down;
    }

    static void allPaths(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.print("[" + " " + p + " ]");
            return;
        }

        if (r > 1) {
            allPaths(p + "R", r - 1, c);
        }
        if (c > 1) {
            allPaths(p + "D", r, c - 1);
        }
        if (r > 1 && c > 1) {
            allPaths(p + "Di", r - 1, c - 1);
        }

    }

    static void avoidObstacles(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println("[" + " " + p + " ]");
            return;
        }
        if (r == 2 && c == 2) {
            return;
        }
        if (r > 1 && c > 1) {
            avoidObstacles(p + "di->", r - 1, c - 1);
        }
        if (r > 1) {
            avoidObstacles(p + "R->", r - 1, c);
        }
        if (c > 1) {
            avoidObstacles(p + "D->", r, c - 1);
        }
    }

    static void avoidObstacles(String p, int r, int c, boolean[][] board) {
        if (r == board.length - 1 && c == board[r].length - 1) {
            System.out.println(p);
            return;
        }
        if (!board[r][c]) {
            return;
        }

        if (r < 2) {
            avoidObstacles(p + "R", r + 1, c, board);
        }
        if (c < 2) {
            avoidObstacles(p + "D", r, c + 1, board);
        }
    }

    static void allDirections(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.print(p);
            return;
        }

        if (r > 1) {
            allDirections(p + "R", r - 1, c);
        }
        if (c > 1) {
            allDirections(p + "D", r, c - 1);
        }
        if (r < 3) {
            allDirections(p + "U", r + 1, c);
        }
        if (c < 3) {
            allDirections(p + "L", r, c + 1);
        }

    }

    static void allDirections(String p, int r, int c, boolean[][] board) {
        if (r == board.length - 1 && c == board[r].length - 1) {
            System.out.println("[ " + p + " ]");
            return;
        }

        if (!board[r][c]) return;

        board[r][c] = false;

        if (r < board.length - 1) {
            allDirections(p + "D", r + 1, c, board);
        }
        if (c < board[r].length - 1) {
            allDirections(p + "R", r, c + 1, board);
        }
        if (r > 0) {
            allDirections(p + "U", r - 1, c, board);
        }
        if (c > 0) {
            allDirections(p + "L", r, c - 1, board);
        }

        board[r][c] = true;
    }

    static void allDirections(boolean[][] board, int r, int c, int[][] path, int step) {
        if (r == board.length - 1 && c == board[r].length - 1) {
            path[r][c] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println("---------------");
            return;
        }

        if(!board[r][c]){
            return;
        }

        board[r][c] = false;
        path[r][c] = step;


        if(r < board[r].length - 1){
            allDirections(board, r + 1, c, path, step + 1);
        }
        if (c < board.length - 1) {
            allDirections(board, r, c + 1, path, step + 1);
        }


        if(r > 0){
            allDirections(board, r -    1 , c , path, step + 1);
        }

        if(c > 0){
            allDirections(board, r, c - 1, path, step + 1);
        }

        board[r][c] = true;
        path[r][c] = 0;
    }

}