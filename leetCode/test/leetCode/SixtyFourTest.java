package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SixtyFourTest {

    @Test
    public void minPathSum() {

        SixtyFour sixtyFour = new SixtyFour();
        int[][] grid = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        sixtyFour.minPathSum(grid);
    }
}