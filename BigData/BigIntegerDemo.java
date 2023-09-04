package BigData;

import java.math.BigInteger;

public class BigIntegerDemo {
    static BigInteger factorial(int n) {
        BigInteger fact = BigInteger.valueOf(1);

        for(int i = 2 ; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        return fact;
    }
    public static void main(String[] args) {
        //Big Integer from int
        BigInteger n = BigInteger.valueOf(3435);
        BigInteger m = BigInteger.valueOf(325235);
        BigInteger o = BigInteger.valueOf(123456789);

        //BigInteger from String
        BigInteger st = new BigInteger("299999999999999999999999999");
        BigInteger str = BigInteger.valueOf(Long.parseLong("171205712057591"));
        System.out.println(st.add(str));

        System.out.println(str + "1");

        //constants
        BigInteger cn = BigInteger.TWO.pow(2);

        //BigInteger is a class
        BigInteger add = n.add(m);
        System.out.println(add);

        //convert
        System.out.println("-----------");
        int i = n.intValue();
        System.out.println(i);
        int j = st.intValue();
        System.out.println(j);

        //factorial calculate
        System.out.println(factorial(1244151235));
    }
}
