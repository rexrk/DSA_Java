import java.util.ArrayList;

public class arrays {
    public static void main(String[] args) {
        int[] nums = { 5, 6, 7, 0, 1, 2, 3, 4 };

        // is Sorted or not
        // System.out.println(isSorted(nums, 0));

        // linear Search
        // System.out.println(linearSearch(nums, 7, 0));

        // return linear occurrences in arraylist
        // System.out.println(linearOccurrence(nums, 3, 0));

        // Binary Search in rotated array
        System.out.println(binaryInRtddArray(nums, 74, 0, nums.length - 1));
    }

    static boolean isSorted(int[] nums, int i) {
        if (i == nums.length - 1) {
            return true;
        }

        return nums[i] < nums[i + 1] && isSorted(nums, i + 1);
    }

    static int linearSearch(int[] nums, int target, int index) {
        if (index == nums.length) {
            return -1;
        }

        if (nums[index] == target) {
            return index;
        }

        return linearSearch(nums, target, index + 1);

    }

    static ArrayList<Integer> linearOccurance(int[] nums, int target, int i) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (i == nums.length) {
            return ans;
        }

        if (nums[i] == target) {
            ans.add(i);
        }

        ArrayList<Integer> ansCalls = linearOccurance(nums, target, i + 1);
        ansCalls.addAll(0, ans);
        return ansCalls;

    }

    static int binaryInRtddArray(int[] nums, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;
        if (nums[m] == target) {
            return m;
        }

        if (nums[s] <= nums[m]) {
            if (target >= nums[s] && target <= nums[m]) {
                return binaryInRtddArray(nums, target, s, m - 1);
            } else
                return binaryInRtddArray(nums, target, m + 1, e);
        }

        if (target >= nums[m] && target <= nums[e]) {
            return binaryInRtddArray(nums, target, m + 1, e);

        }

        return binaryInRtddArray(nums, target, s, m - 1);

    }
}
