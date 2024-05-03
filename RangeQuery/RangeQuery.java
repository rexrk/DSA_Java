package RangeQuery;

import java.util.Arrays;

public class RangeQuery {

    private int[] blocks;
    private int chunkSize;
    private int[] arr;

    RangeQuery(int[] arr) {
        this.arr = arr;
        int n = arr.length;

        // Calculate Chunk Size
        chunkSize = (int) Math.sqrt(n) + 1;

        //Initialize Blocks
        blocks = new int[chunkSize];

        for (int i = 0; i < n; i++) {
            blocks[i / chunkSize] += arr[i]; 
        }

        System.out.println(Arrays.toString(blocks));
    }

    public int rangeQueryCalculate(int l, int r) {
        int ans = 0;

        //left range
        while(l % chunkSize != 0 && l < r && l != 0) {
            ans += arr[l];
            l++;
        }

        //middle range
        while(l + chunkSize <= r) {
            ans += blocks[l / chunkSize];
            l += chunkSize;
        }

        //right range
        while (l <= r) {
            ans += arr[l];
            l++;
        }

        return ans;
    }

    public void update(int index, int value) {
        if (index < 0 || index >= arr.length) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        int block_id = index / chunkSize;
        blocks[block_id] += value - arr[index];
        arr[index] = value;

    }


}
