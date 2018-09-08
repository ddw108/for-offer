package wangyi;

/**
 * author:DingwenDeng
 * Date:2018/9/8 16:42
 */
import java.util.HashSet;

public class MainC {

    public static void main(String[] args) {
        String s = "wbwbwbw";
        int pre = -1;
        int count = 0;
        int max = 0;
        String maxSub = "";
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1 && maxSub == "") {
                maxSub = s.substring(pre, i);
            }
            if (hashSet.add(s.charAt(i))) {
                if (hashSet.size() == 2) {
                    if (s.charAt(i) == 'b') {
                        hashSet.remove('w');
                    } else {
                        hashSet.remove('b');
                    }
                }
                if (pre == -1) {
                    pre = i;
                }
                count++;
            } else {// 求出max
                hashSet.clear();
                if (count != 0) {
                    if (max < count) {
                        max = count;
                        maxSub = s.substring(pre, i);
                    }
                }
                pre = -1;
                count = 0;
            }
        }
        System.out.println(maxSub);
    }
}