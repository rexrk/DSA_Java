package pattern;

public class patterns {
    public static void main(String[] args) {
        // rectanglePattern();
        // rightAngleTriangle();
        // invertedRightAngleTriangle();
        // numberTriangle();
        pyramid();
    }

    static void rectanglePattern() {
        System.out.println("1 ===============================");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void rightAngleTriangle() {
        System.out.println("2 ===============================");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void invertedRightAngleTriangle() {
        System.out.println("3 ===============================");
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void numberTriangle() {
        System.out.println("4 ===============================");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pyramid() {
        System.out.println("5 ===============================");
        for (int i = -5; i < 5; i++) {
            if (i < 0) {
                for (int j = Math.abs(i); j <= 5; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                for(int j = i; j < 4; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

}
