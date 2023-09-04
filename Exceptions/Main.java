package Exceptions;

public class Main {
    public static void main(String[] args) {
//        ThrowsDemo throwsDemo = new ThrowsDemo();
//        try {
//            throwsDemo.show();
//        } catch (ClassNotFoundException e) {
//            System.out.println(e);
//
//        }
//
        ThrowDemo throwDemo = new ThrowDemo();
        throwDemo.divider(3, 0);
    }
}
