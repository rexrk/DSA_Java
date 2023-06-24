package HashMaps;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args){
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put( 1, "Raman");
        hm.put(2, "Bhargavi");
        hm.put(3, "wuv");

        System.out.println(hm.get(1));

        if(hm.containsKey(2)){
            System.out.println(hm.get(1000));
        }


    }
}
