package Exceptions;

public class ThrowDemo {
    public void divider(int i, int j) {
        try {
            if (j == 0) {
                throw new CustomExceptions("Dividing by zero not possible by humans");
            }
            System.out.println(i / j);
        } catch (CustomExceptions e) {
            System.out.println(e);
        }

    }

}
