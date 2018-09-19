package huawei;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * author:DingwenDeng
 * Date:2018/9/19 20:36
 */
public class MainB {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int payload_len = Integer.valueOf(in.nextLine());
        String[] str = in.nextLine().split(",");
        int begin = Integer.valueOf(str[0]);
        int delete_len = Integer.valueOf(str[1]);
        ArrayList<Integer> list = new ArrayList<>();
        while (in.hasNextLine()) {
            str = in.nextLine().split(",");
            if (str[0].equals("end")) {
                break;
            } else {
                list.add(Integer.valueOf(str[0]));
                list.add(Integer.valueOf(str[1]));
            }
        }
        in.close();
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < list.size(); i += 2) {
            int num1 = list.get(i);
            int num2 = list.get(i + 1);
            int diff = num2 - num1;
            if (begin == -1) {
                res.add("" + num1 + "," + num2);
            } else if (begin > diff) {
                begin -= diff;
                res.add("" + num1 + "," + num2);
            } else {
                if (delete_len > diff) {
                    begin -= delete_len;
                    res.add("" + num1 + "," + 0);
                } else {
                    begin = -1;
                    if (delete_len < (diff / 2)) {
                        res.add("" + num1 + "," + (diff - delete_len));
                    } else {
                        res.add("" + (num1 + delete_len) + "," + (diff - delete_len));
                    }
                }
            }
        }
        for (String temp : res) {
            System.out.println(temp);
        }
    }
}