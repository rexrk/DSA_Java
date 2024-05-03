package RabinKarpAlgorithm;

public class Main {
    public static void main(String[] args) {
        String text = "thquickbrownfoxjumpsoverthelazydog";
        String pattern = "raman";

        System.out.println(KarpRabin.search(text, pattern));

    }


}
