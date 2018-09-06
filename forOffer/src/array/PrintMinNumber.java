package array;

/**
 * author:DingwenDeng
 * Date:2018/9/6 9:37
 */
public class PrintMinNumber {

    private boolean compare(int i, int j) {
        //java的表达方式
        int a = Integer.valueOf(i + "" + j);
        int b = Integer.valueOf(j + "" + i);
        return a > b;
    }

    public String PrintMinNumber(int [] numbers){
        if(numbers.length == 0)
            return new String();
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(compare(numbers[i], numbers[j])){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < numbers.length; i++){
            builder.append(numbers[i]);
        }
        return builder.toString();
    }
}
