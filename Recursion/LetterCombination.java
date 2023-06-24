public class LetterCombination {
    public static void main(String[] args) {
        String s = "12";
        phoneKeys("", s);
    }

    static void phoneKeys(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - 48;
        
        for(int i = (digit - 1) * 3; i < (digit * 3); i++ ){
            char ch = (char)('a' + i);
            phoneKeys(p + ch, up.substring(1));
        }
    }
}
