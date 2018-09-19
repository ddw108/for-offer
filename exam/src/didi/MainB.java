package didi;

import java.util.Scanner;

/**
 * author:DingwenDeng
 * Date:2018/9/18 20:31
 */
public class MainB {

    private static int total;

    public static int range(int[] arr,int last,int len){
        int res = 0;
        if(len == total)
            return 1;
        for (int i = 0; i < 3;i++){
            if(i != last && arr[i] > 0){
                arr[i]--;
                res += range(arr,i,len + 1);
                arr[i]++;
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        String[] strs = str.split(" ");
        int len = strs.length;
        int[] arr = new int[len];
        for (int i = 0;i < len;i++){
            arr[i] = Integer.valueOf(strs[i]);
            total += arr[i];
        }
        int result = range(arr, -1, 0);
        System.out.println(result);
    }
}