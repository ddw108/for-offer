package tree;

/**
 * author:DingwenDeng
 * Date:2018/9/7 10:21
 */
public class IsBalanced {
    public boolean IsBalanced_Solution(TreeNode root){
        if(root == null)
            return true;
        else
            return Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1 && IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }

    private int maxDepth(TreeNode treeNode){
        if(treeNode == null)
            return 0;
        else
            return 1 + Math.max(maxDepth(treeNode.left), maxDepth(treeNode.right));
    }
}

