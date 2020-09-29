package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/valid-anagram/
 * @date 2020/9/29 19:07
 */
public class TwoHundredAndFortyTwo {

    public boolean isAnagram(String s, String t) {
        char[] charS =  s.toCharArray();
        char[] charT = t.toCharArray();
        if (charS.length != charT.length){
            return false;
        }
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < charS.length; i++ ){
            int count = map.getOrDefault(String.valueOf(charS[i]),0);
            map.put(String.valueOf(charS[i]),count+1);
        }

        for (int i = 0; i < charT.length; i++ ){
            int count = map.getOrDefault(String.valueOf(charT[i]),0);
            if (count == 0){
                return false;
            }
            map.put(String.valueOf(charT[i]),count-1);
        }

        return true;

    }

    public boolean isAnagram2(String s, String t) {
        char[] charS =  s.toCharArray();
        char[] charT = t.toCharArray();

        Arrays.sort(charS);
        Arrays.sort(charT);

        return String.valueOf(charS).equals(String.valueOf(charT));

    }

}
