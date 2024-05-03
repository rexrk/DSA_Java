package Bitwise;

public class BitwiseOperators {
    public static void main(String[] args) {
        evenOrOdd(9090);
    }
    //Even or Odd
    static void evenOrOdd(int n) {
        if((n&1) == 0) System.out.println("Number is Even");
        else System.out.println("Number is Odd");
    }
}
