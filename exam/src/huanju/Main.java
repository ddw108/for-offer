package huanju;

/**
 * author:DingwenDeng
 * Date:2018/9/28 20:08
 */
import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0; i < n; i++){
            array.add(sc.nextInt());
        }
        sc.close();
        Collections.sort(array);
        int start = array.get(array.size() - 1);
        int max = 0;
        for(int i = start; i < 2*start; i++){
            int res = 0;
            for(int j = 0; j < array.size(); j++){
                res += i % array.get(j);
            }
            if(res > max)
                max = res;
        }
        System.out.println(max);
    }
}