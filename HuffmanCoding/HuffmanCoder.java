package HuffmanCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import Heap.MinHeap;
public class HuffmanCoder {
    HashMap<Character, String> encoder;
    HashMap<String, Character> decoder;

    private class Node implements Comparable<Node> {
        Character data;
        int cost;
        Node left;
        Node right;

        public Node(Character data, int cost) {
            this.data = data;
            this.cost = cost;
            this.left = null;
            this.right = null;
        }

        @Override
        public int compareTo(Node other) {
            return this.cost - other.cost;
        }
    }

    public HuffmanCoder(String feeder) throws Exception {
        HashMap<Character, Integer> fmap = new HashMap<>();
        for(int i = 0; i < feeder.length(); i++) {
            char cc = feeder.charAt(i);
            fmap.put(cc, fmap.getOrDefault(cc, 0) + 1);
        }

        MinHeap<Node> minHeap = new MinHeap<>();
        Set<Map.Entry<Character, Integer>> entrySet = fmap.entrySet();

        entrySet.forEach(entry -> {
            Node node = new Node(entry.getKey(), entry.getValue());
            minHeap.insert(node);
        });

        while (minHeap.size() != 1) {
            Node first = minHeap.remove();
            Node second = minHeap.remove();

            Node newNode = new Node('\0', first.cost + second.cost );
            newNode.left = first;
            newNode.right = second;

            minHeap.insert(newNode);
        }
        
        Node ft = minHeap.remove();
        encoder = new HashMap<>();
        decoder = new HashMap<>();

        this.initEncoderDecoder(ft, "");
    }

    private void initEncoderDecoder(Node node, String osf) {
        if(node == null) return;
        if(node.left == null && node.right == null) {
            this.encoder.put(node.data, osf);
            this.decoder.put(osf, node.data);
        }

        initEncoderDecoder(node.left, osf + "0");
        initEncoderDecoder(node.right, osf+"1");
    }

    public String encode(String source) {
        StringBuilder sb = new StringBuilder();
        for(char ch : source.toCharArray()) {
            sb.append(encoder.get(ch));
        }
        return sb.toString();

    }

    public String decode(String encodedString) {
        StringBuilder sb = new StringBuilder();
        String key = "";
        for(int i = 0 ; i < encodedString.length(); i++) {
            key = key + encodedString.charAt(i);
            if(decoder.containsKey(key)) {
                sb.append(decoder.get(key));
                key = "";
            }
        }

        return sb.toString();
    }



    
}
