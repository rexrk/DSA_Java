package ThreadDemo;

//class A implements Runnable {
//
//    @Override
//    public void run() {
//        for (int i = 1; i < 10; i++) {
//            System.out.println("In..");
//        }
//    }
//}

//class B implements Runnable {
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("out..");
//        }
//    }
//}

public class InterfaceThread {
    public static void main(String[] args) {
        //Method 1
//        A a = new A();
//        B b = new B();

        //Reducing codes Method 1
//        Thread t1 = new Thread(new A());
//        Thread t2 = new Thread(new B());

        //Reducing Codes by anonymous class
//        Runnable obj1 = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1; i < 10; i++) {
//                    System.out.println("In....");
//                }
//            }
//        };
//
//        Runnable obj2 = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1; i < 10; i++) {
//                    System.out.println("Outgoing ....");
//                }
//            }
//        };


        //Reducing code with Lambda Expression
        Runnable obj1 = () -> {
            for (int i = 1; i < 10; i++) {
                System.out.println("In....");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i < 10; i++) {
                System.out.println("Outgoing ....");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };


        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }


}
