package dataStructures;

import java.util.Arrays;

//        for(int a: left){
//            System.out.println(a);
//        }
//        System.out.println();
//        for(int a: right){
//            System.out.println(a);
//        }
public class maximumBinaryTree {
        static TreeNode r;
        public static TreeNode constructMaximumBinaryTree(int[] nums) {
            treeBuilder(nums,null,null,'l');
            return r;
        }
        public static void treeBuilder(int[] nums,TreeNode p,TreeNode root,char d){
            if(nums.length==0) return;
            int i = 0;
            int max=-1;
            for(int in=0;in<nums.length;in++){
                if(nums[in]>max){
                    max = nums[in];
                    i = in;
                }
            }
            if(root==null){
                root = new TreeNode(max);
                System.out.println(root.val);
            }
            if(p==null) {
                r = root;
            }else{
                if(d=='l'){
                    p.left = root;
                }else{
                    p.right = root;
                }
            }
            int[] left = Arrays.copyOfRange(nums, 0, i);
            int[] right = Arrays.copyOfRange(nums, i+1, nums.length);
            treeBuilder(left,root,root.left,'l');
            treeBuilder(right,root,root.right,'r');
        }
    public static void main(String[] args) {
        int[] a = {3,2,1,6,0,5};
        constructMaximumBinaryTree(a);
    }
}
