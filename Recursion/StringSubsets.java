import java.util.ArrayList;

import javax.swing.plaf.synth.Region;

/**
 * StringSubsets
 */
public class StringSubsets {
    public static void main(String[] args) {
        System.out.println(subset("", "abc"));

    }

    static ArrayList<String> subset(String temp, String s) {
        if (s.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(temp);
            return list;
        }

        char ch = s.charAt(0);

        ArrayList<String> left = subset(temp + ch, s.substring(1));
        ArrayList<String> right = subset(temp, s.substring(1));

        left.addAll(right);
        return left;
    }

}