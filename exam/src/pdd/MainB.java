package pdd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MainB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nNum = sc.nextInt();
        int mNum = sc.nextInt();
        ArrayList<char[]> cIn = new ArrayList<>();
        String temp2 = sc.nextLine();
        for(int i = 0; i < nNum; i++){
            String temp = sc.nextLine();
            char[] tmp = temp.toCharArray();
            cIn.add(tmp);
        }
        char[][] charIn = new char[nNum][mNum];
        for(int i = 0; i < nNum; i++){
            for (int j = 0; j < mNum; j++){
                charIn[i][j] = cIn.get(i)[j];
            }
        }
        int[][] res = new int[nNum][mNum];
        for(int j = 0; j < mNum; j++){
            ArrayList<Integer> lstX = new ArrayList<>();
            ArrayList<Integer> lstO = new ArrayList<>();
            int value = 0;
            int key = -1;
            for(int i = 0; i < nNum; i++){
                if(charIn[i][j] == 'x'){
                    key = i;
                }else if(charIn[i][j] == 'o'){
                    value++;
                }
                if(key >= 0){
                    lstX.add(key);
                    lstO.add(value);
                    key = -1;
                    value = 0;
                }
            }
            for(int k = 0; k < lstX.size(); k++){
                res[lstX.get(k)][j] = 2;
                for(int l = 0; l < lstO.get(k); l++){
                    res[lstX.get(k)-l-1][j] = 1;
                }
            }
        }
        for(int i = 0; i < nNum; i++){
            for(int j = 0; j < mNum; j++){
                if(res[i][j] == 0){
                    System.out.print('.');
                }else if(res[i][j] == 1){
                    System.out.print('o');
                }else{
                    System.out.print('x');
                }
            }
            System.out.print("\n");
        }
    }
}
