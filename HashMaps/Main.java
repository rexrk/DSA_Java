package HashMaps;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // RabinKarpAlgo algo = new RabinKarpAlgo();
        // String text = "ramanisplayingagame";
        // String pattern = "raman";
        // algo.rabinKarpSearch(text, pattern);
        
        TreeMap<Integer[], Character> map = new TreeMap<>();
        map.put(new Integer[]{0, 0}, 'a');
        // map.put(new Integer[]{2, 0}, 'c');
        // map.put(new Integer[]{1, -1}, 'b');
        System.out.println(map);
    }
}