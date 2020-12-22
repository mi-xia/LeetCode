package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoHundredAndFortyTest {

    @Test
    public void searchMatrix() {

        TwoHundredAndForty s = new TwoHundredAndForty();
        s.searchMatrix(new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}},20);
//        s.searchMatrix(new int[][]{{1},{3},{5}},3);
//        s.searchMatrix(new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}},5);
//        s.searchMatrix(new int[][]{{1,3}},3);

    }
}