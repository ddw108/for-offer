package array;

import java.util.ArrayList;

/**
 * author:DingwenDeng
 * Date:2018/9/6 9:57
 */
public class GetUglyNumber {

    public int GetUglyNumber_Solution(int index){
        if(index <= 0)
            return index;
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(1);
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        while (lst.size() < index){
            int m2 = lst.get(i2)*2;
            int m3 = lst.get(i3)*3;
            int m5 = lst.get(i5)*5;
            int temp = Math.min(Math.min(m3, m5), m2);
            //所有符合情况的都得+1，否则会出现重复
            if(temp == m2)
                i2++;
            if(temp == m3)
                i3++;
            if(temp == m5)
                i5++;
            lst.add(temp);
        }
        return lst.get(index - 1);
    }
}
