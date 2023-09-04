package Leetcode;

public class Leet28 {
    public static void main(String[] args) {
        System.out.println(strStr("abc", "c", 0));
    }

    public static int strStr(String haystack, String needle, int i) {

        if(haystack.startsWith(needle)){
            return i;
        }

        return strStr(haystack.substring(1), needle, i+1);
        
    }
}
