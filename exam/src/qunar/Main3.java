package qunar;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * author:DingwenDeng
 * Date:2018/10/10 10:30
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        String[] strings = str.split(" ");
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            num.add(strings[i].charAt(0) - '0');
        }
        int len = num.size();
        int i = 0;
        int index = 0;
        ArrayList<Integer> time_jump = new ArrayList<>();
        int index_last;
        int max = 0;
        boolean flag = false;
        while (index < len - 1) {
            int range = num.get(i);
            int j;
            int bushu1 = 1;
            int bushu2 = 0;
            for (j = 1; j <= range; j++) {
                int index_curr = index + j;
                index_last = index_curr + num.get(index + j);
                if (index_curr == len - 1) {
                    time_jump.add(j);
                    index_last = len - 1;
                    flag = true;
                    break;
                }
                if (max < index_last) {
                    max = index_last;
                    bushu1 = j;
                    bushu2 = num.get(index + j);
                }
            }
            if (!flag) {
                time_jump.add(bushu1);
                time_jump.add(bushu2);
            }
            index = max;
            i = index;
        }
        int len1 = time_jump.size();
        for (int j = 0; j < time_jump.size(); j++) {
            System.out.print(time_jump.get(j) + " ");
        }
    }
}
