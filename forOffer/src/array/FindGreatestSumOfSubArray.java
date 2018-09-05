package array;

/**
 * author:DingwenDeng
 * Date:2018/9/5 11:38
 */
public class FindGreatestSumOfSubArray {

    public int FindGreatestSumOfSubArray(int[] array){
        if(array.length == 0)
            return 0;
        int sumNow = array[0];
        int sumMax = array[0];
        for(int i = 1; i < array.length; i++){
            if(sumNow >= 0)
                sumNow+=array[i];
            else
                sumNow = array[i];
            if(sumNow > sumMax)
                sumMax = sumNow;
        }
        return sumMax;
    }
}
