package qunar;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * author:DingwenDeng
 * Date:2018/10/10 9:24
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        String[] strings = str.split(" ");
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arrayList.add(strings[i].charAt(0) - '0');
        }
        ArrayList<Integer> result = jump(arrayList);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(result.size() - i - 1) + " ");
        }
    }

    public static ArrayList<Integer> jump(ArrayList<Integer> nums) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (nums == null || nums.size() == 0) {
            return arrayList;
        }
        int reach = 0;//当前所能到达的最远坐标
        int last = 0;//上一跳可达最远坐标
        int count = 0;//跳跃次数
        int pos = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (i > reach) {
                return arrayList;
            }
            if (i > last) {
                arrayList.add(i - pos);
                count++;
                last = reach;
                pos = i;
            }
            if (i + nums.get(i) > reach) {
                reach = i + nums.get(i);
            }
        }
        return arrayList;
    }
}
