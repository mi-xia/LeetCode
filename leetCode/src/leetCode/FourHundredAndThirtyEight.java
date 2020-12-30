package leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/find-all-anagrams-in-a-string/
 * @date 2020/12/29 22:28
 */
public class FourHundredAndThirtyEight {

    public List<Integer> findAnagrams(String s, String p) {

        int len = p.length();
        int s_len = s.length();
        if (s_len < len){
            return new ArrayList<>();
        }

        int[] dic = new int[26];

        int[] window = new int[26];

        List<Integer> res = new ArrayList<>();
        int i = 0;
        for ( ; i < len; i++){
            dic[p.charAt(i)-'a'] += 1;
        }

        int l = 0;
        int r = 0;

        while (r < s_len){
            int cur = s.charAt(r) - 'a';
            r++;
            window[cur] += 1;

            while (window[cur] > dic[cur]){
                int curL = s.charAt(l) - 'a';
                l++;
                window[curL] -= 1;
            }

            if (r-l == len){
                res.add(l);
            }

        }

        return res;


    }

}
