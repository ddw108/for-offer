package array;

/**
 * author:DingwenDeng
 * Date:2018/9/5 15:15
 */
public class NumberOf1Between1AndN {

    public int NumberOf1Between1AndN_Solution(int n){
        int num = 0;
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < n; i++)
            builder.append(i);
        String sum = builder.toString();
        for(int i = 0; i < sum.length(); i++){
            if(sum.charAt(i) == '1')
                num++;
        }
        return num;
    }
}
