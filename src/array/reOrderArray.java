package array;

public class reOrderArray {

    public void reOrderArray(int [] array){
        if(array.length <= 1)
            return;
        int oddCount = 0;
        int oddPos = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i]%2 == 1)
                oddCount++;
        }
        int[] newArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 1)
                newArray[oddPos++] = array[i];
            else
                newArray[oddCount++] = array[i];
        }
        for(int i = 0; i < array.length; i++){
            array[i] = newArray[i];
        }
    }
}
