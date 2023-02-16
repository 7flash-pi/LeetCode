public class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        else{
            int l = maxDepth(root.left);
            int r = maxDepth(root.right);
            return (1 + ((l > r) ? l : r)); 
            //T O(n) S O(n)
            
        }
    }
}