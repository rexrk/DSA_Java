package pattern;

public class patterns1 {
    public static void main(String[] args) {
        // leftTriangle();
        // leftDownTriangle();
        // pyramid();
        downwardsPyramid();
    }

    static void leftTriangle() {
        System.out.println("6 ===============================");
        for (int i = 1; i <= 5; i++) {
            for (int sp = 5; sp > i; sp--) {
                System.out.print(" ");
            }
            for (int st = 1; st <= i; st++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void leftDownTriangle() {
        System.out.println("7 ===============================");
        for (int i = 1; i <= 5; i++) {
            for (int sp = 1; sp < i; sp++) {
                System.out.print(" ");
            }
            for (int st = 5; st >= i; st--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pyramid() {
        System.out.println("8 ===============================");
        for (int i = 1; i <= 5; i++) {
            for (int sp = 5; sp > i; sp--) {
                System.out.print(" ");
            }

            for (int st = 1; st <= (i * 2) - 1; st++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void downwardsPyramid() {
        System.out.println("9 ===============================");
        for (int i = 5; i >= 1; i--) {
            for (int sp = 5; sp > i; sp--) System.out.print(" ");
            for(int st = (i*2)-1; st >= 1; st--) System.out.print("*");
            System.out.println();
        }
    }
}