package toutiao;

import java.util.LinkedList;
import java.util.Scanner;
/**
 * author:DingwenDeng
 * Date:2018/9/9 10:58
 */
public class MainE {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[m][2];
        for (int i = 0; i < m; ++i) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(friends(arr, n));
    }

    private static int friends(int[][] r, int n) {
        int count = 0;
        int s = r[0][0];
        boolean[] b = new boolean[r.length];
        LinkedList<Integer> list = new LinkedList<>();
        boolean flag = true;
        b[0] = true;
        while (flag) {
            list = new LinkedList<Integer>();
            list.add(s);
            for (int j = 0; j < list.size(); j++) {
                int key = list.get(j);
                for (int i = 0; i < r.length; i++) {
                    if (r[i][0] == key) {
                        if (!list.contains(r[i][1])) {
                            list.add(r[i][1]);
                        }
                        b[i] = true;
                    } else if (r[i][1] == key) {
                        if (!list.contains(r[i][0])) {
                            list.add(r[i][0]);
                        }
                        b[i] = true;
                    }
                }
            }
            if (list.size() == n) {
                ++count;
            }
            for (int i = 0; i < b.length; i++) {
                if (b[i] == false) {
                    s = r[i][0];
                    break;
                } else if (i == b.length - 1 && scanTotal(b))
                    flag = false;
            }
        }
        return count;
    }

    private static boolean scanTotal(boolean[] b) {
        for (int i = 0; i < b.length; i++) {
            if (b[i] == false) {
                return false;
            }
        }
        return true;
    }
}