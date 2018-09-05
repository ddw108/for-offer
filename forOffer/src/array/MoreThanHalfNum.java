package array;

public class MoreThanHalfNum {

    public int MoreThanHalfNum_Solution(int [] array){
        if(array == null || array.length == 0)
            return 0;
        int times = 0;
        int result = array[0];
        //如果有超过一半的数，那么它一定是最后幸存的数
        for(int i = 0; i < array.length; i++){
            if(times == 0){
                result = array[i];
                times = 1;
            }else{
                if(array[i] == result)
                    times++;
                else
                    times--;
            }
        }
        //但是最后幸存的数不一定是最终的结果，还需要再次判断一次
        times = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == result){
                times++;
            }
        }
        if(times*2 <= array.length)
            return 0;
        return result;
    }
}
