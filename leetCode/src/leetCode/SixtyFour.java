package leetCode;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/minimum-path-sum/
 * @date 2020/11/14 1:00
 */
public class SixtyFour {

    public int minPathSum(int[][] grid) {
        int x = grid[0].length;
        int y = grid.length;
        if (x == 0 || y == 0){
            return 0;
        }

        int[][] dp = new int[y][x];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < x; i++ ){
            dp[0][i] = dp[0][i-1] + grid[0][i];
        }
        for (int k = 1; k < y; k++ ){
            dp[k][0] = dp[k-1][0] + grid[k][0];
        }

        for (int i = 1; i < y; i++){
            for (int k = 1; k < x; k++){
                dp[i][k] = Math.min(dp[i-1][k] + grid[i][k], dp[i][k-1] + grid[i][k]);
            }
        }


        return dp[y-1][x-1];
    }



//    int min = Integer.MAX_VALUE;

//    public int minPathSum(int[][] grid) {
//        doMinPathSum(grid,0 ,0,0);
//        return min;
//    }
//
//
//    public void doMinPathSum(int[][] grid, int tmpSum, int x, int y){
//
//
//        if (x >= grid[0].length - 1 && y >= grid.length - 1 ){
//            min = tmpSum;
//            return;
//        }
//
//        for (int i = x; i < grid[0].length; i++ ){
//            for (int k = y; k < grid.length; k++){
//                if (tmpSum > min){
//                    break;
//                }
//                tmpSum += grid[k][i];
//                doMinPathSum(grid,tmpSum,i+1 >= grid.length ? i : i+1 , i+1 >= grid.length ? k + 1 : k );
//                tmpSum = tmpSum - grid[k][i];
//            }
//        }
//
//    }


}
