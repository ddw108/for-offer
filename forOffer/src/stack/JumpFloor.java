package stack;

public class JumpFloor {
    public int JumpFloor(int target){
        if(target == 1)
            return 1;
        else if(target == 2)
            return 2;
        int sum = 0;
        int res1 = 1;
        int res2 = 2;
        while (target - 2 > 0){
            sum = res1 + res2;
            res1 = res2;
            res2 = sum;
            target--;
        }
        return sum;
    }
}
