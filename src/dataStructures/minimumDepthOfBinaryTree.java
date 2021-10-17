package dataStructures;

public class minimumDepthOfBinaryTree {
    int minC=9999999;
    public int minDepth(TreeNode root) {
        helper(root,0);
        if(minC==9999999){
            return 0;
        }
        return minC+1;
    }
    public void helper(TreeNode root, int c){
        if(root==null) return;
        if(c==0){
            if(root.left==null && root.right==null){
                minC=0;
                return;
            }
        }
        System.out.println(root.val+" "+minC+" "+c);
        if(root.left==null && root.right==null){
            if(c<minC) minC=c;
            return;
        }
        c+=1;
        if(root.left!=null) helper(root.left,c);
        if(root.right!=null) helper(root.right,c);
    }
    public static void main(String[] args) {

    }
}
