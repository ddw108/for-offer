package didi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * author:DingwenDeng
 * Date:2018/9/18 19:46
 */
public class MainA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strs = scanner.nextLine().split(" ");
        String pos = strs[0];
        int length = pos.length();
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> res1 = new ArrayList<>();
        ArrayList<String> res2 = new ArrayList<>();
        ArrayList<String> res3 = new ArrayList<>();
        for(int i = 1; i < strs.length; i++){
            if(pos.length() == strs[i].length()){
                int unknown = 0;
                char isNo1 = '0';
                char isNo2 = '0';
                for(int j = 0; j < length; j++){
                    if(pos.charAt(j) != strs[i].charAt(j)){
                        isNo1 = pos.charAt(j);
                        isNo2 = strs[i].charAt(j);
                        if(isOne(isNo1, isNo2)){
                            unknown++;
                        }else
                            unknown += 2;
                    }
                }
                if(unknown == 1)
                    res1.add(strs[i]);
                else if(unknown == 0)
                    result.add(strs[i]);
                else if(unknown == 2)
                    res2.add(strs[i]);
                else
                    res3.add(strs[i]);
            }else if(pos.length() == strs[i].length() + 1){
                int p = 0;
                for(int j = 0; j < length; j++){
                    if(pos.charAt(j) == strs[i].charAt(p))
                        p++;
                }
                if(p == strs[i].length())
                    res3.add(strs[i]);
            }else if(pos.length() == strs[i].length() - 1){
                int p = 0;
                for(int j = 0; j < length; j++){
                    if(pos.charAt(p) == strs[i].charAt(j))
                        p++;
                }
                if(p == pos.length())
                    res3.add(strs[i]);
            }
        }
        result.addAll(res1);
        result.addAll(res2);
        result.addAll(res3);
        if(result.size() == 1)
            System.out.println(result.get(0));
        else if(result.size() == 2)
            System.out.println(result.get(0) + " " + result.get(1));
        else
            System.out.println(result.get(0) + " " + result.get(1) + " " + result.get(2));
    }

    private static boolean isOne(char c1, char c2){
        char[] chars = {'q', 'w', 'e', 'r', 't', 'a', 's', 'd', 'f', 'g', 'z', 'x', 'c', 'v'};
        boolean pos1 = false;
        boolean pos2 = false;
        for(int i = 0; i <chars.length; i++){
            if(c1 == chars[i])
                pos1 = true;
            if(c2 == chars[i])
                pos2 = true;
        }
        if(pos1 == true && pos2 == true || pos1 == false && pos2 == false)
            return true;
        else
            return false;
    }
}
