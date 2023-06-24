package HashSet;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        set.add(3);
        set.add(5);
        set.add(990);
        set.add((int)33.23);


        System.out.println(set.contains(3));
        System.out.println(set);
        set.clear();
        System.out.println(set);
    }

}
