package leetCode;

import javax.xml.bind.annotation.XmlInlineBinaryData;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/maximal-square/
 * @date 2020/12/20 19:34
 * dp[i][j]表示以第i行第j列为右下角所能构成的最大正方形边长, 则递推式为:
 *         dp[i][j] = 1 + min(dp[i-1][j-1], dp[i-1][j], dp[i][j-1]);
 */
public class TwoHundredAndTwentyOne {

    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1){
            return 0;
        }

        int h = matrix.length;
        int w = matrix[0].length;
        int max = 0;

        int[][] dp = new int[h+1][w+1];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == '1'){
                    dp[i+1][j+1] = 1 + Math.min(Math.min(dp[i][j+1],dp[i+1][j]),dp[i][j]);
                    max = Math.max(max,dp[i+1][j+1]);
                }
            }
        }

        return max * max;

    }
}
