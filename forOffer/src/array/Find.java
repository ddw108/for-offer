package array;

public class Find {

    public boolean Find(int target, int[][] array){
        boolean res = false;
        if(array.length < 0 || array[0].length < 0)
            return res;
        int i = 0;
        int j = array[0].length - 1;
        while(i < array.length && j >= 0){
            if(target == array[i][j])
                return true;
            else if(target > array[i][j])
                i++;
            else
                j--;
        }
        return res;
    }
}
