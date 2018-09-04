package tree;

import java.util.Stack;

public class Convert {

    //难
    public TreeNode Convert(TreeNode pRootOfTree){
        if(pRootOfTree == null)
            return null;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = pRootOfTree;
        TreeNode pre = null;
        Boolean isFirst = true;
        while (p != null || !stack.empty()){
            while (p != null){
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();
            if(isFirst){
                pRootOfTree = p;
                pre = pRootOfTree;
                isFirst = false;
            }else{
                pre.right = p;
                p.left = pre;
                pre = p;
            }
            p = p.right;
        }
        return pRootOfTree;
    }
}
