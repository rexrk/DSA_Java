package LamdaExpressions;

import java.util.Arrays;

public class IntArraySort {
    public static void main(String[] args) {
        int[][] arr = { {9, 3,},
                        {2, 4},
                        {5, 3} };
        sort(arr);
        
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
    static void sort(int[][] arr) {
        Arrays.sort(arr, (a, b) -> a[0]-b[0]);
        Arrays.sort(null, null);
    }
}
