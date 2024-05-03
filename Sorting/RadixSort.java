package Sorting;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] nums = {461, 78, 431, 34, 49, 50};
        System.out.println(Arrays.toString(nums));
        radixSort(nums);
        System.out.println(Arrays.toString(nums));
        
    }

    public static void radixSort(int[] nums) {
        if(nums.length <= 1) throw new IllegalArgumentException("Nothing to sort");

        int max = Arrays.stream(nums).max().getAsInt();

        for(int exp = 1; max/exp > 0; exp *= 10) {
            countSort(nums, exp);
        }

    }

    private static void countSort(int[] nums, int exp) {
        int n = nums.length;
        int[] countArray = new int[10];
        int[] outputArray = new int[n];

        for(int num : nums) {
            countArray[(num / exp) % 10]++;
        }

        for(int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i-1];
        }

        for(int i = n-1; i >= 0; i--) {
            outputArray[countArray[(nums[i] / exp)%10]-1] = nums[i];
            countArray[(nums[i] / exp)%10]--;
        }

        System.arraycopy(outputArray, 0, nums, 0, n);
    }
}
