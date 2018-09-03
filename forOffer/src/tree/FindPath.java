package tree;

import java.util.ArrayList;

public class FindPath {

    private ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    private ArrayList<Integer> res = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target){
        if(root == null)
            return result;
        res.add(root.val);
        target -= root.val;
        if(target == 0 && root.left == null && root.right == null)
            result.add(new ArrayList<>(res));
        FindPath(root.left, target);
        FindPath(root.right, target);
        //这一步删除十分关键，保证了记录路径的Array的唯一性！
        res.remove(res.size() - 1);
        return result;
    }
}
