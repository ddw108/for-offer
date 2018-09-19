package huawei;

import java.util.*;

/**
 * author:DingwenDeng
 * Date:2018/9/19 19:15
 */
public class MainC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        HashMap<Integer, HashSet<Integer>> hashMap = new HashMap<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            String[] strings = scanner.nextLine().split(" ");
            if (strings.length > 1) {
                HashSet<Integer> set = new HashSet<>();
                for (int j = 1; j < strings.length; j++) {
                    int now = Integer.valueOf(strings[j]);
                    if (now > max)
                        max = now;
                    set.add(now);
                }
                hashMap.put(Integer.valueOf(strings[0]), set);
            }
        }
        scanner.close();
        ArrayList<Integer> stack = new ArrayList<>();
        HashSet<Integer> res = new HashSet<>();
        stack.add(0);
        while (!stack.isEmpty()) {
            int num = stack.remove(0);
            res.add(num);
            for (int i = 0; i < max+1; i++) {
                if(hashMap.containsKey(num)){
                    if (hashMap.get(num).contains(i)) {
                        stack.add(i);
                    }
                }
            }
        }
        ArrayList<Integer> result1 = new ArrayList<>();
        ArrayList<Integer> result2 = new ArrayList<>();
        result1.addAll(res);
        Collections.sort(result1);
        for (int i = 0; i < result1.size(); i++) {
            int m = 0;
            for (int j = 0; j < max+1; j++) {
                if(hashMap.containsKey(j)){
                    if (hashMap.get(j).contains(result1.get(i)) && res.contains(j))
                        m++;
                }
            }
            result2.add(m);
        }
        for (int i = 0; i < result1.size(); i++) {
            System.out.println(result1.get(i) + " " + result2.get(i));
        }
    }
}