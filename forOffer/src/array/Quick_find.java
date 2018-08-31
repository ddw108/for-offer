package array;

public class Quick_find {

    //可返回的结果是第low个数据，在数组中的排序是第几个
    public static int partition(int[] arr, int low, int high){
        int temp = arr[low];
        while(low < high){
            while (arr[high] <= temp && low < high)
                --high;
            arr[low] = arr[high];
            while (arr[low] >= temp && low < high)
                ++low;
            arr[high] = arr[low];
        }
        arr[high] = temp;
        return high;
}

    //不断的缩小空间去找到对应的第K个数据，如果刚好相等则是最终的结果
    public static void find_k(int k, int[] arr, int low, int high){
        int temp = partition(arr, low, high);
        if(temp == k-1){
            System.out.println("结果是" + arr[temp]);
        }else if(temp > k-1){
            find_k(k, arr, low, temp-1);
        }else {
            find_k(k, arr, temp+1, high);
        }
    }
}
