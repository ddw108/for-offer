package array;

import java.util.ArrayList;

public class GetLeastNumbers {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(input.length < k)
            return result;
        for(int i = 0; i < k; i++){
            for(int j = 0; j < input.length - i - 1; j++){
                if(input[j+1] > input[j]){
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
            result.add(input[input.length - i - 1]);
        }
        return result;
    }
}
