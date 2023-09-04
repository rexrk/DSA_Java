package Exceptions;

public class CustomExceptions extends Exception{
    public CustomExceptions(String message) {
        System.out.println("This is a custom Exception Handling. All I want you to print this while encountering an exception");
    }
}