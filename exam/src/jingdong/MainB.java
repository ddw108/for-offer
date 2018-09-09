package jingdong;

/**
 * author:DingwenDeng
 * Date:2018/9/9 20:24
 */
import java.util.Scanner;

public class MainB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] A = new int[n][3];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[i][0] < A[j][0] && A[i][1] < A[j][1] && A[i][2] < A[j][2]) {
                    result++;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
