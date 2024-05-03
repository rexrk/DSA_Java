public class tes {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;
        char[] allow = allowed.toCharArray();
        for(String s: words) {
            for(char c : allow) s.replaceAll(String.valueOf(c), "");

            if(s.isEmpty()) ans++;
            
        }
        
        return ans;
    }
    
}