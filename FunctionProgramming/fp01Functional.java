package FunctionProgramming;

import java.util.List;

public class fp01Functional {
    public static void main(String [] args) {
//        printAllNumbersInListSFunctional(List.of(33, 6, 2, 5, 11, 1, 10, 2, 9, 4));
        printAllEvenNumbersInListFunctional(List.of(33, 6, 2, 5, 11, 1, 10, 2, 9, 4));

    }

    private static boolean isEven(int num) {
        return num%2 == 0;
    }
    private static void printAllEvenNumbersInListFunctional(List<Integer> nums) {
        //using lambda
//        nums.forEach(n -> {if(n%2== 0) System.out.println(n);});

        //method reference
        nums.stream()
            .filter(fp01Functional::isEven)
            .forEach(System.out::print);
        System.out.println();
        //implement filter directly
        nums.stream()
                .filter(n -> n%2 ==0)
                .forEach(System.out::println);

    }


    private static void print(int num) {
        System.out.println(num);
    }

    static void printAllNumbersInListFunctional(List<Integer> list) {
        // lambda expression
        list.forEach(n -> System.out.println(n));

        //Method Reference
        list.forEach(fp01Functional::print);

        //Convert to Stream
        list.stream().forEach(System.out::println);

    }
}
