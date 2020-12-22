package leetCode;

import com.sun.xml.internal.fastinfoset.util.StringArray;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/search-a-2d-matrix-ii/
 * @date 2020/12/21 11:09
 */
public class TwoHundredAndForty {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0){
            return false;
        }
        int h = matrix.length;
        int w = matrix[0].length;
        int i = 0;
        int j = w-1;
        while(i < h && j >= 0) {

            if (matrix[i][j] == target){
                return true;
            } else if (matrix[i][j] < target){
                i++;
            } else if (matrix[i][j] > target){
                j--;
            }
        }

        return false;
    }


    public boolean searchMatrix3(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0){
            return false;
        }
        int h = matrix.length;
        int w = matrix[0].length;
        int i = 0;
        for (; i < matrix.length; i++){
            if (i + 1 < h && matrix[i+1][0] >= target){
                i++;
                break;
            }
        }
        i = (i == 0 ? 0 : i-1);
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j] == target){
                return true;
            }

            if (j + 1 < w && matrix[i][j+1] > target){
                break;
            }
        }

        return false;
    }

    public boolean searchMatrix2(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0){
            return false;
        }

        int h = matrix.length;
        int w = matrix[0].length;
        int hStart = 0;
        int hEnd = h-1;
        int wStart = 0;
        int wEnd = w-1;

        while ((hStart <= hEnd) || (wStart <= wEnd)) {
            int hMid = (hStart + hEnd) >> 1;
            int wMid = (wStart + wEnd) >> 1;

            if (matrix[hMid][wMid] == target){
                return true;
            }

            if (matrix[hMid][wMid] > target){
                hEnd = hMid-1 < hStart ? hEnd : hMid-1;
                wEnd = wMid-1 < wStart ? wEnd : wMid-1;
            }
            if (matrix[hMid][wMid] < target){
                hStart = hMid+1 > hEnd ? hStart : hMid+1;
                wStart = wMid+1 > wEnd ? wStart : wMid+1;
            }
        }

        return false;
    }
}
