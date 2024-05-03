package HuffmanCoding;

public class Main {
    public static void main(String[] args) {
        String str = "Hello Mf World";
        System.out.println("original message :" + str);
        HuffmanCoder coder;
        try {
            coder = new HuffmanCoder(str);
            String coded = coder.encode(str);
            System.out.println("coded : "+ coded);

            String decoded = coder.decode(coded);
            System.out.println("decoded : " + decoded);
        } 
        catch (Exception e) {
            System.out.println("Error in Program");
        }

        

    }
}
