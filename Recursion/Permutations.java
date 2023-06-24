import java.util.ArrayList;

public class Permutations {

    public static void main(String[] arsgs){
        permString("", "abc");

        // System.out.println(permString2("", "abc"));
    }

    static void permString(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            
            permString(f + ch + s, up.substring(1));
        }

    }

    static ArrayList<String> permString2(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            
            list.addAll(permString2(f + ch + s, up.substring(1)));
        }
        return list;

    }
}