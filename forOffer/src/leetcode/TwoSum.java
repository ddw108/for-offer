package leetcode;

import java.util.HashMap;

/**
 * 类注释，描述
 *
 * @author dengdingwwen
 * @version $Id: TwoSum.java,v 1.0 2018/12/3 11:28 dengdingwwen
 * @date 2018/12/3 11:28
 */
public class TwoSum {
    public int[] twoSum1(int[] nums, int target) {
        int res[] = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return null;
    }

    public int[] twoSum2(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int res[] = new int[2];
        for(int i = 0; i < nums.length; i++){
            int resTarget = target - nums[i];
            if(map.containsKey(resTarget)){
                res[0] = map.get(resTarget);
                res[1] = i;
                return res;
            }
            map.put(nums[i], i);
        }
        return null;
    }
}