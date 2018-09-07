package tree;

/**
 * author:DingwenDeng
 * Date:2018/9/7 10:00
 */
public class TreeDepthRecursion {

    public int TreeDepth(TreeNode root){
        return searchTree(root, 0);
    }

    private int searchTree(TreeNode root, int deep){
        if(root == null)
            return deep;
        else
            deep++;
        int leftDeep = searchTree(root.left, deep);
        int rightDeep = searchTree(root.right, deep);
        if(leftDeep > rightDeep)
            return leftDeep;
        else
            return rightDeep;
    }
}
