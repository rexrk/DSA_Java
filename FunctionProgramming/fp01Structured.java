package FunctionProgramming;

import java.util.List;

public class fp01Structured {
    public static void main(String [] args) {
        printAllNumbersInListStructured(List.of(3, 6, 2, 5, 11, 1, 10, 2, 9, 4));
    }
    static void printAllNumbersInListStructured(List<Integer> list) {
        //traditional index approach
        for(int i = 0 ; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println("\n-------------------------------");

        //Enhanced For Loop
        for (int num: list) {
            System.out.print(num + ", ");
        }

    }
}
