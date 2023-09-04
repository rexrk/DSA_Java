package ThreadDemo;

class hi extends Thread {

    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("hi");

        }
    }
}

class hello extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("hello");

        }
    }
}


public class ClassThread {
    public static void main(String[] args) {
        hi obj1 = new hi();
        hello obj2 = new hello();

        obj1.start();
        obj2.start();
    }
}
