package SlidingWindow;

public class MaxSumFromSubarray {
    public static void main(String[] args) {
        int[] arr = {100, 3, 5, 2, 7, 9, 10, 10};
        int k = 3;
        System.out.println(maxSum(arr, k));
    }

    public static int maxSum(int[] arr, int k) {
        int i = 0;
        int currSum = 0;
        int maxSum = 0;
        for(int f = 0; f < k; f++) {
            currSum += arr[f]; 
            maxSum = Math.max(maxSum, currSum);
        }
        
        int prev = i;
        i += k;
        while(i < arr.length) {
            currSum -= arr[prev++];

            currSum += arr[i++];
            
            maxSum = Math.max(maxSum, currSum);
        }   

        return maxSum;
    }
}

