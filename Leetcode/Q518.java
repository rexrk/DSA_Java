package Leetcode;
//Coin Change 2
public class Q518 {
    public static void main(String[] args) {
//        int[] dices = {1, 2, 3, 4, 5, 6};
//        change(dices, 3, 0);
        Integer e = 0;
        int[] num = {0};
        num(num);
        System.out.println(num[0]);
    }
    static void change(int[] dices, int target, int ans) {
        if(target == 0) {
            ans++;
            System.out.println(ans);
            return;
        }
        for(int i = 1; i <= target; i++) {
            for(int c = 0; c < dices.length; c++) {
                change(dices, target - dices[c], ans);
            }
        }
    }

    static void num(int[] n) {
        n[0] += 1;
    }
}
