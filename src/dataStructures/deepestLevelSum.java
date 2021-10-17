package dataStructures;

import java.util.*;

public class deepestLevelSum {
    Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
    public int helper(TreeNode root,int h) {
        if(root==null) return 0;
        if(root.left==null && root.right==null){
            List<Integer> a = map.get(h);
            if(a==null){
                a= new ArrayList<>();
                a.add(root.val);
            }else{
                a.add(root.val);
            }
            map.put(h,a);
            return root.val;
        }
        return helper(root.left,h+1)+helper(root.right,h+1);
    }
    public int deepestLeavesSum(TreeNode root){
        helper(root,0);
        int mx = -1;
        for(int key: map.keySet()){
            if(key>mx){
                mx = key;
            }
        }
        int sum=0;
        for(int i: map.get(mx)){
            sum+=i;
        }
        return sum;
    }
}
