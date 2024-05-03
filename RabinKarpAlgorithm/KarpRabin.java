package RabinKarpAlgorithm;

public class KarpRabin {
    private static final int PRIME = 101;

    private static double calculateHash(String st) {
        double hash = 0;
        for (int i = 0; i < st.length(); i++) {
            hash += st.charAt(i) * Math.pow(PRIME, i);
        }
        return hash;
    }

    private static double updateHash(double prevHash, char oldChar, char newChar, int patternLength) {
        double newHash = (prevHash - oldChar) / PRIME;
        newHash = newHash + newChar * Math.pow(PRIME, patternLength - 1);
        return newHash;
    }

    public static boolean search(String text, String pattern) {
        int patternLength = pattern.length();
        double patternHash = calculateHash(pattern);
        double textHash = calculateHash(text.substring(0, patternLength));
        
        for(int i = 0; i <= text.length() - patternLength; i++) {
            if(textHash == patternHash) {
                if(text.substring(i, i+patternLength).equals(pattern)) {
                    System.out.println("Pattern at index : " + i);
                    return true;
                }
            }
            if(i < text.length() - patternLength) {
                textHash = updateHash(textHash, text.charAt(i), text.charAt(i+patternLength), patternLength);
            }
        }
        return false;
    }
}
