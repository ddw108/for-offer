package wangyi;

import java.util.ArrayList;
import java.util.Scanner;

public class MainB{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> res = new ArrayList<>();
        int nums = in.nextInt();
        // 房子总数
        int n;
        // 已有住户数量
        int k;
        for (int i = 0; i < nums; i++) {
            n = in.nextInt();
            k = in.nextInt();
            res.add(getResult(n, k));
        }
        in.close();
        for (String str : res) {
            System.out.println(str);
        }
    }

    public static String getResult(int n, int k) {
        int min = 0;
        int max = 0;
        if (n > 2 && k > 1) {
            max = Math.min(k - 1, n - k);
        }
        return "" + min + " " + max;
    }
}