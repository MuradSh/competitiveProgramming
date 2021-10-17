package dataStructures;
import com.sun.source.tree.Tree;

import java.util.*;

public class treeInOrder {

    static List<Integer> l = new ArrayList<Integer>();
    public static List<Integer> inorderTraversal(TreeNode root) {
        if(root==null){
            return null;
        }
        inorderTraversal(root.left);
        l.add(root.val);
        inorderTraversal(root.right);
        return l;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {
        TreeNode n = new TreeNode(1);
        System.out.println(inorderTraversal(n));
    }
}
