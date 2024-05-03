package Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {3, 6, 6, 7, 1, 10, 9};
        // countSort(arr);
        countSortWithHashMap(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void countSort(int[] arr) {
        if(arr == null || arr.length <= 1) throw new IllegalArgumentException("Array is sorted");

        int max = Arrays.stream(arr).max().getAsInt();

        int[] countArray = new int[max+1];

        for(int num : arr) countArray[num]++;
        
        int index = 0;
        for(int i = 0; i < countArray.length; i++) {
            while(countArray[i] > 0) {
                arr[index] = i;
                countArray[i]--;
                index++;
            }
        }
        
    }

    public static void countSortWithHashMap(int[] nums) {
        if(nums == null || nums.length <= 1) throw new IllegalArgumentException("Nothing to Sort");
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int max = Collections.max(map.keySet());
        int i = Collections.max(map.keySet());
        int index = 0;
        for(; i <= max; i++) {
            if(map.containsKey(i)) {
                int iter = map.get(i);
                while(iter > 0) {
                    nums[index] = i;
                    iter--;
                    index++;
                }
                map.remove(i);
            }
        }

    }
}
