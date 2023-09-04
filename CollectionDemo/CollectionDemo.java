package CollectionDemo;

import java.util.*;

record student(int stId, String name) implements Comparable<student> {

    @Override
    public String toString() {
        return "student{" +
                "stId=" + stId +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(student that) {
        if (this.name.length() == that.name.length()) {
            return 0;
        }
        return this.name.length() > that.name.length() ? 1 : -1;
    }
}

public class CollectionDemo {
    public static void main(String[] args) {

        List<student> data = new ArrayList<student>();
        data.add(new student(16, "raman"));
        data.add(new student(11, "com"));
        data.add(new student(15, "tantra"));

        Comparator<student> com = (s1, s2) -> s1.stId() > s2.stId() ? 1 : -1;
        data.sort(com);
        data.forEach(System.out::println);


    }
}
