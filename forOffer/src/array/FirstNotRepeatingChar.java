package array;

import java.util.HashMap;

/**
 * author:DingwenDeng
 * Date:2018/9/6 10:04
 */
public class FirstNotRepeatingChar {

    public int FirstNotRepeatingChar(String str) {
        if(str == null)
            return -1;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                //必须保留总数而不是删除，因为删除了以后，不能保证之后又加上这个key
                int value = map.get(str.charAt(i));
                map.put(str.charAt(i), value+1);
            }else{
                map.put(str.charAt(i), 1);
            }
        }
        for(int i = 0; i < str.length(); i++){
            if(map.get(str.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}
