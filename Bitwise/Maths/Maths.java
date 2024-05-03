package Bitwise.Maths;

public class Maths {
    public static void main(String[] args) {
        magicNumber(6);
        System.out.println(numberOfDigits(128));
        System.out.println(numberOfDigitsInAnyBase(100, 2));
    }
    //Magic Number
    static void magicNumber(int n) {
        int ans = 0;
        int b = 5;
        while(n > 0) {
            int last = n & 1;
            ans += last * b;
            b *= 5;
            n >>= 1;
        }
        System.out.println("Magic Number: " + ans);
    }

    //Number of digits
    static int numberOfDigits(int num) {
        return (int)(Math.log10(num) + 1);
    }

    //Number of digits in any base
    static int numberOfDigitsInAnyBase(int num, int base) {
        return (int)(Math.log(num)/Math.log(base)) + 1;
    }
}
