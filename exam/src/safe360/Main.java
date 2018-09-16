package safe360;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * author:DingwenDeng
 * Date:2018/9/16 19:37
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] A = new long[N];
        int[] B = new int[N];
        for(int i = 0; i < N; i++){
            A[i]  = scanner.nextLong();
        }
        for(int i = 0; i < N; i++){
            B[i] = scanner.nextInt();
        }
        scanner.close();
        for(int i = 0; i < N; i++){
            long max = -1000000001;
            long min = 1000000001;
            for(int j = i; j >= i - B[i] + 1 && j >= 0; j --){
                if(A[j] < min)
                    min = A[j];
                if(A[j] > max)
                    max = A[j];
            }
            System.out.println(max*min);
        }
    }
}
