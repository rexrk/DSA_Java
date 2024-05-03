package HashMaps;

public class RabinKarpAlgo {
    private final int PRIME = 101;

    private double calculateHash(String str) {
        double hash = 0;
        for(int i = 0; i < str.length(); i++) {
            hash += str.charAt(i) * Math.pow(PRIME, i);
        }
        return hash;
    }

    private double updateHash(double prevHash, int lastChar, int nextChar, int patternLength) {
        double newHash = (prevHash - lastChar) / PRIME;
        return newHash + nextChar * Math.pow(PRIME, patternLength - 1);
    }

    public void rabinKarpSearch(String text, String pattern) {
        int patternLength = pattern.length();
        int textLength = text.length();
        double patternHash = calculateHash(pattern);
        double textHash = calculateHash(text.substring(0, patternLength));

        boolean flag = false;
        for(int i = 0; i <= textLength - patternLength; i++) {
            if(textHash == patternHash) {
                if(pattern.equals(text.substring(i, i+patternLength))) {
                    System.out.println("Pattern Matched !!!");
                    flag = true;
                    break;
                }
            }

            if(i < textLength - patternLength) {
                textHash = updateHash(textHash, text.charAt(i), text.charAt(i+patternLength), patternLength);
            }
        }
        if(!flag) System.out.println("Pattern Not Found !!!");
    }
}
