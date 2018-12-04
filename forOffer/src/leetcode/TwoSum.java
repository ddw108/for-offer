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

    //在进行迭代并将元素插入到表中的同时，我们还会回过头来检查表中是否已经存在当前元素所对应的目标元素。
    // 如果它存在，那我们已经找到了对应解，并立即将其返回。
    //1、确定当前数字，需要再加上哪个数字才可组成目标数字
    //2、原来的map中是否有这个数字
    //3、有即是目标结果，没有则继续找
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