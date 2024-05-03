package Leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;



public class Q987 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    
        TreeNode() {}
    
        TreeNode(int val) {
            this.val = val;
        }
    
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        //Answer List
        List<List<Integer>> ans = new ArrayList<>();
        //Map [x, y] -> Nodes 
        TreeMap<int[], List<TreeNode>> map = new TreeMap<>(new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
            
        });

        populateMap(map, root, 0, 0);
        
        for (Map.Entry<int[], List<TreeNode>> entry : map.entrySet()) {
            List<TreeNode> list = entry.getValue();
            list.sort(Comparator.comparingInt(node -> node.val));

            List<Integer> nodesList = new ArrayList<>();
            list.forEach(item -> nodesList.add(item.val));
            ans.add(nodesList);
        }
        return ans;

    }
    private void populateMap(TreeMap<int[], List<TreeNode>> map, TreeNode root, int row, int col) {
        if(root == null) return;

        int[] rowCol = new int[] {row, col};

        List<TreeNode> list = map.get(rowCol);
        if(list == null) list = new ArrayList<>();
        list.add(root);

        map.put(rowCol, list);

        populateMap(map, root.left,row + 1, col-1);
        populateMap(map, root.right, row + 1, col+1);
    }

}
