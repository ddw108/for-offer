/**
 * \$Id: LengthOfLongestSubstring.java,v 1.0 2018/12/4 10:23 dengdingwen
 *
 * @Copyright (c) 2018/12/4, Lianjia Group All Rights Reserved.
 */
package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 类注释，描述
 *
 * @author dengdingwwen
 * @version $Id: LengthOfLongestSubstring.java,v 1.0 2018/12/4 10:23 dengdingwwen
 * @date 2018/12/4 10:23
 */
public class LengthOfLongestSubstring {

    //map
    //滑动窗口
    //我们可以定义字符到索引的映射，而不是使用集合来判断一个字符是否存在。
    // 当我们找到重复的字符时，我们可以立即跳过该窗口。
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.equals("")) {
            return 0;
        }
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < s.length(); end++) {
            if (map.containsKey(s.charAt(end))) {
                start = Math.max(map.get(s.charAt(end)), start);
            }
            maxLength = Math.max(maxLength, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

}