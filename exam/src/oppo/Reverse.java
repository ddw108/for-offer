package oppo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * author:DingwenDeng
 * Date:2018/9/10 19:32
 */
public class Reverse {

    ArrayList<Integer> reverse(ArrayList<Integer> input){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < input.size(); i++){
            String str = Integer.toString(input.get(i));
            StringBuilder builder = new StringBuilder();
            for(int j = str.length() - 1; j >= 0; j--){
                builder.append(str.charAt(j));
            }
            int res =  Integer.valueOf(builder.toString()).intValue();
            result.add(res);
        }
        Collections.sort(result, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });;
        return result;
    }
}
