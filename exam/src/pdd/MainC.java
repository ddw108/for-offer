package pdd;

import java.util.Scanner;
import java.util.HashMap;

public class MainC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        solve(a, b);
    }

    public static void solve(int a, int b) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // 求余数
        a = a % b;
        int len = 0;
        int index = 0;
        while (a != 0) {
            // 保存此时的小数位
            map.put(a, index++);
            a *= 10;
            a = a % b;
            if (map.containsKey(a)) {
                len = map.size() - map.get(a);
                break;
            }
        }
        if (len == 0) {
            System.out.println((map.size()) + " " + len);
        } else {
            System.out.println((map.size() - len) + " " + len);
        }
    }
}
