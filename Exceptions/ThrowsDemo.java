package Exceptions;

public class ThrowsDemo {
    public void show () throws ClassNotFoundException{
        Class.forName("jod");
    }
}
