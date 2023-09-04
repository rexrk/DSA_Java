package InterpolationSearch;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6, 8, 10, 14, 15, 19, 20, 25, 26, 60};
        int target = 25;
        int find = IS(nums, target);
        if(find != -1) {
            System.out.println(find);
        } else
            System.out.println("Not Found");
    }

    public static int IS(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while(target >= arr[s] && target <= arr[e] && s <= e ){
            int probe = s + (e-s) * (target - arr[s]) / (arr[e] - arr[s]);
            System.out.println("probe :" + probe);

            if(arr[probe] == target) {
                return probe;
            }
            else if(arr[probe] < target) {
                s = probe + 1;
            } else
                e = probe - 1;
        }
        return  -1;
    }
}
