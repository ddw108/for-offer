package pdd;

import java.util.ArrayList;
import java.util.Scanner;

public class MainD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        String temp2 = sc.nextLine();
        ArrayList<char[]> lst = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            char[] temp = sc.nextLine().toCharArray();
            lst.add(temp);
        }
        for(int i = 0; i < N; i++){
            for(int j = 1; j < L; j++){
                if(lst.get(i)[j] != lst.get(i)[0]){

                }
            }
        }
        System.out.println("-");
    }
}