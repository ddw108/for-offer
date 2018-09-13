package xunlei;

import java.util.Scanner;

/**
 * author:DingwenDeng
 * Date:2018/9/12 20:06
 */
public class MainB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();
        int n = 0;
        for (int i = 7; i >= 0; i--) {
            if (A * i + B * (7 - i) < 0) {
                n = i;
                break;
            }
        }
        int result = 0;
        if (n < 3) {
            result = 2 * (7 - n) * B + (3 - n) * B + A * 3 * n;
        } else {
            result = 2 * (7 - n) * B + A * (3 + 2 * n);
        }
        System.out.println(result);
    }
}
