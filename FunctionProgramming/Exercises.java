package FunctionProgramming;

import java.util.List;

public class Exercises {
    public static void main(String[] args) {
//        printOddNumbersFromList(List.of(3, 4, 5, 6, 7, 8, 9, 10));
//        printAllCourses(List.of("Spring", "Spring Boot", "Spring Data", "API", "Microservices", "AWS", "Docker", "Kubernetes"));
//        printSpringCourses(List.of("Spring", "Spring Boot", "Spring Data", "API", "Microservices", "AWS", "Docker", "Kubernetes"));
//        printMin4letters(List.of("Spring", "Spring Boot", "Spring Data", "API", "Microservices", "AWS", "Docker", "Kubernetes"));
//        printCubeOfOddNumbers(List.of(3, 4, 5, 6, 7, 8, 9, 10));
        printLengthOfString(List.of("Spring", "Spring Boot", "Spring Data Jpa", "API", "Microservices", "AWS", "Docker", "Kubernetes"));

    }

    private static void printLengthOfString(List<String> list) {
        list.stream()
                .map(crs -> crs + " " + crs.length())
                .forEach(System.out::println);
    }

    private static void printCubeOfOddNumbers(List<Integer> nums) {
        nums.stream()
                .filter(num -> num%2 != 0)
                .map(num -> Math.pow(num, 3))
                .forEach(System.out::println);
    }

    private static void printMin4letters(List<String> list) {
        list.stream()
                .filter(word -> word.length() >= 4)
                .forEach(System.out::println);
    }

    private static void printSpringCourses(List<String> spring) {
        spring.stream()
                .filter(str -> str.contains("Spring"))
                .forEach(System.out::println);
    }

    private static void printAllCourses(List<String> courses) {
        courses.stream()
                .forEach(System.out::println);
    }

    static void printOddNumbersFromList(List<Integer> list) {
        list.stream()
                .filter(n -> n%2==1)
                .forEach(System.out::println);
    }
}
