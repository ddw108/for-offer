package array;

import java.util.ArrayList;

/**
 * author:DingwenDeng
 * Date:2018/9/7 10:49
 */
public class FindNumsAppearOnce {

    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < array.length; i++){
            if(list.contains(array[i]))
                list.remove(new Integer(array[i]));
            else
                list.add(array[i]);
        }
        if(list != null){
            num1[0] = list.get(0);
            num2[0] = list.get(1);
        }
    }
}
