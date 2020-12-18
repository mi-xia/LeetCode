package leetCode;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/number-of-islands/
 * @date 2020/12/17 22:48
 */
public class TwoHundred {

    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == '1'){
                    count++;
                    doNumIslands(grid,i,j);
                }
            }
        }
        return count;
    }


    private void doNumIslands(char[][] grid, int i, int j) {

        if(!inArea(grid,i,j)){
            return;
        }

        if (grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '2';

        doNumIslands(grid,i-1,j);
        doNumIslands(grid,i,j+1);
        doNumIslands(grid,i+1,j);
        doNumIslands(grid,i,j-1);

    }

    private boolean inArea(char[][] grid, int i, int j) {
        return 0 <= i && i < grid.length
                && 0 <= j && j < grid[0].length;
    }


}
