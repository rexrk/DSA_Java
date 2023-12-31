import java.util.ArrayList;

public class DiceCombination {
    public static void main(String[] args){
        
         dice("", 6);

//        System.out.println(diceRet("", 4));
    }

    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for(int i = 1; i <= target; i++){
            dice(p + i, target - i);
        }
    }

    static ArrayList<String> diceRet(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1; i <= target && i <= 6; i++){
            ans.addAll(0, diceRet(p+i, target-i));
        }
        return ans;

    }


}
