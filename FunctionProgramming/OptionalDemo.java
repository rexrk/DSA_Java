package FunctionProgramming;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalDemo {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "mango", "grapes");
        getFruit(fruits);
    }
    private static void getFruit(List<String> fruits) {
        Predicate<? super String> predicate = fruit -> fruit.startsWith("a");
        Optional<String> value = fruits.stream()
                .filter(predicate)
                .findFirst();
        
    }
}
