/**
 * ceilingNum
 */
public class ceilingNum {

    public static void main(String[] args) {
        int[] nums = { 2, 3, 5, 9, 14, 16, 18 };
        System.out.println(ceil(nums, 19));
    }

    static int ceil(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        int m = 0;
        while (s < e) {
            m = s + (e - s) / 2;

            if (nums[m] == target) {
                return target;
            }

            else if (nums[m] < target) {
                s = m + 1;
            } else
                e = m - 1;
        }

        return nums[s];
    }
}