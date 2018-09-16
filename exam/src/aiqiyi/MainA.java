package aiqiyi;

import java.util.Scanner;

/**
 * author:DingwenDeng
 * Date:2018/9/15 10:39
 */
//public class MainA {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        int[] array = new int[6];
//        for(int i = 0; i < 6; i++){
//            array[i] = str.charAt(i) - '0';
//        }
//        int res1 = array[0] + array[1] + array[2];
//        int res2 = array[3] + array[4] + array[5];
//        if(res1 == res2){
//            System.out.println(0);
//        }
//        else if(Math.abs(res1 - res2) <= 9){
//            System.out.println(1);
//        }else if(Math.abs(res1 - res2) <= 18){
//            System.out.println(2);
//        }else{
//            System.out.println(3);
//        }
//    }
//}
public class MainA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        for(int i = 0; i < 6; i++){
            if(i < 3){
                array1[i] = str.charAt(i) - '0';
            }else{
                array2[i - 3] = str.charAt(i) - '0';
            }
        }
        int res1 = array1[0] + array1[1] + array1[2];
        int res2 = array2[0] + array2[1] + array2[2];
        if(res1 == res2){
            System.out.println(0);
        }
        else if(res1 > res2){
            int num = res1 - res2;
            int n1 = Math.max(Math.max(array1[0], array1[1]), array1[2]);
            int n2 = 10 - Math.min(Math.min(array2[0], array2[1]), array2[2]);
            if(num < Math.max(n1, n2))
                System.out.println(1);
            else if(num < Math.max(n1, n2) + 9)
                System.out.println(2);
            else
                System.out.println(3);
        }else{
            int num = res2 - res1;
            int n2 = Math.max(Math.max(array2[0], array2[1]), array2[2]);
            int n1 = 10 - Math.min(Math.min(array1[0], array1[1]), array1[2]);
            if(num < Math.max(n1, n2))
                System.out.println(1);
            else if(num < Math.max(n1, n2) + 9)
                System.out.println(2);
            else
                System.out.println(3);
        }
    }
}