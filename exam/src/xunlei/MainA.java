package xunlei;

import java.util.Scanner;
/**
 * author:DingwenDeng
 * Date:2018/9/12 19:39
 */
public class MainA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        int result = 0;
        for (int i = 1; i <= (int) Math.sqrt(N / 2.0); i++) {
            for (int j = i + 1; j <= (int) Math.sqrt(N / 1.0); j++) {
                if (!(get(i, j) == 1 && (i % 2 != j % 2))) {
                    continue;
                }
                int a = j * j - i * i;
                int b = 2 * j * i;
                int c = i * i + j * j;
                if (c > N) {
                    break;
                }
                if (get(a, b) == 1 && get(a, c) == 1 && get(b, c) == 1) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }

    public static int get(int a, int b) {
        return b == 0 ? a : get(b, a % b);
    }
}
