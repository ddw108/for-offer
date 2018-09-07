package meituan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * author:DingwenDeng
 * Date:2018/9/6 20:12
 */
public class MainA {

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
        for(int i = 0; i < n - k + 1; i++){
            int[] A = new int[k];
            for(int j = i, s = 0; j < i + k; j++, s++){
                A[s] = arrayList.get(j);
            }
            if(scan(A, t))
                result++;
        }
        System.out.println(result);
        scanner.close();
    }

    private static boolean scan(int[] array, int t){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            if(map.containsKey(array[i])){
                int value = map.get(array[i]);
                if(value + 1 == t)
                    return true;
                map.put(array[i], value+1);
            }else{
                map.put(array[i], 1);
            }
        }
        return false;
    }
}
