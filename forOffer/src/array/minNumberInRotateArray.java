package array;

public class minNumberInRotateArray {

    public int minNumberInRotateArray(int [] array){
        if(array.length <= 0)
            return 0;
        int low = 0;
        int high = array.length - 1;
        while(low < high){
            int mid = (low + high)/2;
            if(array[mid] > array[high])
                low = mid + 1;
            else if(array[mid] == array[high])
                high--;
            else
                high = mid;
        }
        return array[low];
    }
}
