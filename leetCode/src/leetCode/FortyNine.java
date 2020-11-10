package leetCode;

import com.google.common.primitives.Chars;
import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.*;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/group-anagrams/comments/
 * @date 2020/11/10 19:11
 */
public class FortyNine {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> result = new HashMap<>(8);

        for (String s : strs){
            char[] tmp = s.toCharArray();
            Arrays.sort(tmp);
            String key = new String(tmp);
            if (null != result.get(key)){
                List<String> vaule = new ArrayList<>(result.get(key));
                vaule.add(s);
                result.put(key,vaule);
            } else {
                result.put(key, Arrays.asList(s));
            }
        }

        return new ArrayList<>(result.values());

    }

}
