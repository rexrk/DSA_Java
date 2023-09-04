package CollectionDemo;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEachMethod {
    public static void main(String[] a) {
        List<Integer> list = Arrays.asList(2, 3, 5, 7, 8, 10, 15, 20);
//        list.forEach(n -> System.out.println(n));
//        list.forEach(System.out::println);

        //Stream Api
        Stream<Integer> st = list.stream();
        st.filter(n -> n%2==0).forEach(System.out::println);
    }


}
