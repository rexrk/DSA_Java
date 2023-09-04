package List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee("Ram", "ram", 3235);
        list.add(emp1);
        list.add(new Employee("jj", "jkj", 2));
        list.add(new Employee("lolo", "jojo", 3));
        list.add(new Employee("demon", "slayer", 4));

        System.out.println(list.size());
//        list.remove(emp1);
//        System.out.println(list.isEmpty());

        //replace
        list.set(0, new Employee("gggu","bha", 335));

        list.add(0, new Employee("raman", "ram", 1));

        System.out.println(list.contains(new Employee("raman", "ram", 1)));


        //iteration
        list.forEach(System.out::println);
    }
}
