package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class FortyEightTest {

    @Test
    public void rotate() {
        FortyEight fortyEight = new FortyEight();

        int[][] m = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        fortyEight.rotate(m);
    }
}