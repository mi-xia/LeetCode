package leetCode;

import java.util.Map;

/**
 * @author 邹磊
 * @version 1.0
 * @description:
 * @date 2021/5/19 11:56
 */
public class Three {


    public int lengthOfLongestSubstring(String s) {

        int max = 0;
        int start = 0;
        int n = s.length();
        int[] lastIndex = new int[128];
        for (int i = 0; i< lastIndex.length; i++) {
            lastIndex[i] = -1;
        }

        for (int i = 0; i < n; i++) {

            int tmp = s.charAt(i);
            start = Math.max(start, lastIndex[tmp] + 1);
            max = Math.max(max, i - start + 1);
            lastIndex[tmp] = i;
        }

        return max;

    }

}
