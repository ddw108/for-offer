package toutiao;

import java.util.HashMap;
import java.util.Scanner;

/**
 * author:DingwenDeng
 * Date:2018/9/9 10:21
 */
public class MainB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        System.out.println(maxSubstring(str));
    }

    public static int maxSubstring(String str) {
        if (str.length()==0)
            return 0;
        int max=0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i=0, j=0; i<str.length(); ++i){
            if (map.containsKey(str.charAt(i))){
                j = Math.max(j,map.get(str.charAt(i))+1);
            }
            map.put(str.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
}