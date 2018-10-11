package zoom;

import java.util.Scanner;

/**
 * author:DingwenDeng
 * Date:2018/9/29 17:08
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int pos = 1;
        boolean[] arr = new boolean[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
        }
        int leftCount = n;
        int countNum = 0;
        int index = 0;
        while (leftCount > 1) {
            if (arr[index] == true) {
                countNum++;
                if (countNum == 3) {
                    countNum = 0;
                    arr[index] = false;
                    leftCount--;
                }
            }
            index++;
            if (index == n) {
                index = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == true) {
                System.out.println(i + 1);
            }
        }
    }
}


