package Bitwise.Maths;

public class PascalsTriangle {
    public static void main(String[] args) {
        printElementInTriangle(5, 3);
    }

    static void printElementInTriangle(int n, int r) {
        n--; r--;
        int res = 1;
        for(int i = 0; i < r; i++) {
            res = res * (n-i);
            res = res / (i+1);
        }
        System.out.println("Element : " + res);
    }
}
