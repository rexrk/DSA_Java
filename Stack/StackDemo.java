package Stack;

import java.util.*;

class GamesStore {
    String gameName;
    Integer version;

    public GamesStore(String gameName, Integer version) {
        this.gameName = gameName;
        this.version = version;
    }

    @Override
    public String toString() {
        return "GamesStore{" +
                "gameName='" + gameName + '\'' +
                ", version=" + version +
                '}';
    }
}


public class StackDemo {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.empty());

        GamesStore rkGamer = new GamesStore("valorant", 1);
        GamesStore razer = new GamesStore("GTA", 5);
        GamesStore cosmicByte = new GamesStore("apex legends", 1);
        GamesStore antE_sports = new GamesStore("Modern Warfare", 3);


        Stack<GamesStore> stack1 = new Stack<>();
        stack1.push(rkGamer);
        stack1.push(razer);
        stack1.push(cosmicByte);
        stack1.push(antE_sports);

        stack1.forEach(System.out::println);

        System.out.println(stack1.search(razer));
    }
}
