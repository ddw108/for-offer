package array;

/**
 * author:DingwenDeng
 * Date:2018/9/6 10:34
 */
public class GetNumberOfK {

        public int GetNumberOfK(int [] array , int k){
            int length = array.length;
            if(length <= 0)
                return 0;
            int start = getFirstIndex(array, k, 0, length-1);
            int end = getLastIndex(array, k, 0, length-1);
            return end - start + 1;
        }

        //用二分查找，找到这个区间的左右边缘
        private int getFirstIndex(int [] array , int k, int start, int end) {
        int mid = (start + end) / 2;
        while (start <= end) {
            //左区间
            if (array[mid] >= k)
                end = mid - 1;
            else
                start = mid + 1;
            mid = (start + end) / 2;
        }
        return start;
    }

    private int getLastIndex(int [] array , int k, int start, int end){
        int mid = (start + end) / 2;
        while (start <= end){
            //右区间
            if(array[mid] <= k)
                start = mid - 1;
            else
                end = mid + 1;
            mid = (start + end) / 2;
        }
        return end;
    }
}
