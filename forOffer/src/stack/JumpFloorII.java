package stack;

import java.util.ArrayList;

public class JumpFloorII {
    public int JumpFloorII(int target){
        if(target == 1)
            return 1;
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(1);
        while (target - 1 > 0){
            int sum = 0;
            for(int i = 0; i < lst.size(); i++){
                sum += lst.get(i);
            }
            sum++;
            lst.add(sum);
            target--;
        }
        return lst.get(lst.size() - 1);
    }
}
