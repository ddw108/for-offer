package meituan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * author:DingwenDeng
 * Date:2018/9/6 20:39
 */
public class MainA2 {

    private static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int t = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int temp = scanner.nextInt();
            arrayList.add(temp);
        }
        int result = 0;
        //判断过程
        for(int i = 0; i < k; i++){
            putValue(arrayList.get(i));
        }
        for(int i = k; i < n; i++){

        }
    }

    private static void putValue(int valueIn){
        if(map.containsKey(valueIn)){
            int value = map.get(valueIn);
            map.put(valueIn, value+1);
        }else{
            map.put(valueIn, 1);
        }
    }
}
