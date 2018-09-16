package tengxun;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * author:DingwenDeng
 * Date:2018/9/16 11:26
 */
public class MainA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        if(n > 9){
            System.out.println(2*n);
            return;
        }
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            array1.add(i);
        }
        array1.add(n+1);
        array2.add(n+1);
        n++;
        while (getCommonMultipleNum(array1) != getCommonMultipleNum(array2)){
            n++;
            array1.add(n);
            array2.add(n);
        }
        System.out.println(n);
    }

    private static int getCommonMultipleNum(ArrayList<Integer> arr){
        int number = 0;
        while (!isCommonMultipleNum(number, arr)) {
            number++;
        }
        return number;
    }

    private static boolean isCommonMultipleNum(int num, ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            int current = arr.get(i);
            if (num < current || num % current != 0) {
                return false;
            }
        }
        return true;
    }
}