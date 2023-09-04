package BigData;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        notBD();
        System.out.println("------");
        BD();
    }
    static void notBD() {
        double a = 0.01;
        double b = 0.03;
        double ans = b - a;
        System.out.println(ans);
        System.out.println((float) ans);
    }

    static void BD() {
        BigDecimal b = new BigDecimal("0.03");
        BigDecimal c = new BigDecimal("0.04");
        BigDecimal d = c.subtract(b);
        BigDecimal e = b.subtract(c);
        System.out.println(d); 
        System.out.println(e);
    }
}
