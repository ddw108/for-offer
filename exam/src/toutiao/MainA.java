package toutiao;

import java.util.Scanner;

/**
 * author:DingwenDeng
 * Date:2018/9/9 10:02
 */
public class MainA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int[][] buMen = new int[m][m];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                int n = scanner.nextInt();
                buMen[i][j] = n;
            }
        }
        scanner.close();
        System.out.println(getCount(buMen));
    }

    public static int getCount(int[][] A) {
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] == 1) {
                    result++;
                    erase(A, i, j);
                }
            }
        }
        return result;
    }

    public static void erase(int[][] A, int i, int j) {
        A[i][j] = 0;
        while (i - 1 >= 0 && A[i - 1][j] == 1) {
            erase(A, i - 1, j);
        }
        while (i + 1 < A.length && A[i + 1][j] == 1) {
            erase(A, i + 1, j);
        }
        while (j - 1 >= 0 && A[i][j - 1] == 1) {
            erase(A, i, j - 1);
        }
        while (j + 1 < A[0].length && A[i][j + 1] == 1) {
            erase(A, i, j + 1);
        }
    }
}