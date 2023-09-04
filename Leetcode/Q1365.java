package Leetcode;

import java.util.HashMap;

public class Q1365 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(23, 7);
        map.put(3, 5);
        map.put(63, 2);
        map.forEach((n, m) -> System.out.println(n + " : " + m));
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[nums.length];
        return ans;
    }
}
