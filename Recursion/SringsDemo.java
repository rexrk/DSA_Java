public class SringsDemo {
    public static void main(String[] args){
        // System.out.println(skipString("", "baaccd"));

        System.out.println(countDigits(10000));
    }

    static String skipString(String p, String up){
        if(up.isEmpty()){
            return p;
        }

        char ch = up.charAt(0);
        if(ch == 'a'){
            return skipString(p, up.substring(1));
        } else 
            return skipString(p+ch, up.substring(1));
    }

    static int countDigits(int n) {
        if(n < 10){
            return 0;
        }
        if(n == 0){
            return 1;

        } else {
            int lastDig = n % 10;
            int count = countDigits(n/10);

            if(lastDig == 0){
                count ++;
            }

            return count;
        }

    }

    



}
