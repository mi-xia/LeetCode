package leetCode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/word-break/submissions/
 * @date 2020/12/15 18:51
 */
public class OneHundredAndThirtyNine {

    Map<String,Boolean> map = new HashMap<>();

    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        Boolean[] dp = new Boolean[n+1];
        dp[0] = true;


        for (String tmp : wordDict){
            map.put(tmp,true);
        }

        for (int i = 1; i <= n; i ++){

            for (int j = i-1; j >= 0; j --){
                dp[i] = dp[j] && check(s.substring(j,i));
                if (dp[i]){
                    break;
                }
            }

        }

        return dp[n];

    }


    public Boolean check(String s){
        return map.getOrDefault(s,false);
    }

}
