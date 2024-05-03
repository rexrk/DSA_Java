package RangeQuery;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // int[] arr = {1, 3, 5, 2};
        // RangeQuery rq = new RangeQuery(arr);
        // System.out.println(rq.rangeQueryCalculate(0, 2)); 
        // // Expected output: 
        // rq.update(1, 2);
        // System.out.println(rq.rangeQueryCalculate(0, 2)); 
        // // Expected output: 



        // int[] arr = {0, 0, 0, 0, 0};
        // RangeQuery rq = new RangeQuery(arr);
        // System.out.println(rq.rangeQueryCalculate(0, 4)); 
        // // Expected output: 0
        // rq.update(1, 2);
        // System.out.println(rq.rangeQueryCalculate(0, 4)); 
        // // Expected output: 1

        int[] arr = new int[1088];
        Arrays.fill(arr, 1);
        RangeQuery rq = new RangeQuery(arr);
        System.out.println(rq.rangeQueryCalculate(0, 1087)); // Expected output: 1000000
        rq.update(0, 500000);
        System.out.println(rq.rangeQueryCalculate(0, 1087)); // Expected output: 999999
        int[] arrrr = new int[0];
        System.out.println((arrrr) == null);
        
    }
}
