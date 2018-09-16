package tengxun;

import java.util.Scanner;

/**
 * author:DingwenDeng
 * Date:2018/9/16 10:27
 */
public class MainB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cityNum = scanner.nextInt();
        int roadNum = scanner.nextInt();
        int[] result = new int[cityNum];
        int[][] road = new int[cityNum][cityNum];
        for(int i = 0; i < roadNum; i++){
            int m = scanner.nextInt() - 1;
            int n = scanner.nextInt() - 1;
            road[m][n] = 1;
        }
        scanner.close();
        for(int k = 0; k < cityNum; k++){
            for(int i = 0; i < cityNum; i++){
                for(int j = 0; j < cityNum; j++){
                    if(road[i][k] == 1 && road[k][j] == 1)
                        road[i][j] = 1;
                }
            }
        }
        int res = 0;
        for(int i = 0; i < cityNum; i++){
            for(int j = 0; j < cityNum; j++){
                if(road[i][j] == 1){
                    result[i]--;
                    result[j]++;
                }
            }
        }
        for(int i = 0; i < cityNum; i++){
            if(result[i] > 0)
                res++;
        }
        System.out.println(res);
    }
}

