package toutiao;

import java.util.Scanner;
/**
 * author:DingwenDeng
 * Date:2018/9/9 10:25
 */

public class MainD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.valueOf(scanner.nextLine());
        String[] str = scanner.nextLine().split("\\s+");
        scanner.close();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = Integer.valueOf(str[i]);
        }
        int result = isValid(input) ? 1 : 0;
        System.out.println(result);
    }

    public static boolean isValid(int[] A) {
        if (A == null || A.length == 0) {
            return false;
        }
        boolean pos = true;
        for (int i = 0; i < A.length; i++) {
            int index = 0;
            if (A[i] > 255)
                return false;
            if ((A[i] & 128) == 0) {
                index = 1;
            } else if ((A[i] & 224) == 192) {
                index = 2;
            } else if ((A[i] & 240) == 224) {
                index = 3;
            } else if ((A[i] & 248) == 240) {
                index = 4;
            } else {
                return false;
            }
            for (int j = 1; j < index; j++) {
                if (i + j >= A.length || (A[i + j] & 192) != 128)
                    return false;
            }
            i = i + index - 1;
        }
        return pos;
    }
}
