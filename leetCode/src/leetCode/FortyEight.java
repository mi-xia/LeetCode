package leetCode;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/rotate-image/
 * @date 2020/11/8 18:06
 */
public class FortyEight {


    public void rotate(int[][] matrix) {

        // 第一步 水平置换
        for(int i = 0; i < matrix[0].length; i++){
            for (int j = 0;j < matrix.length/2; j++){
                int tmp = matrix[j][i];
                matrix[j][i] = matrix[matrix.length-j-1][i];
                matrix[matrix.length-j-1][i] = tmp;
            }
        }

        // 第二步，斜对角线置换
        for (int k = 0; k < matrix.length; k++){
            for (int l = 0; l <= k; l++){
                int tmp = matrix[k][l];
                matrix[k][l] = matrix[l][k];
                matrix[l][k] = tmp;
            }
        }


        for (int m = 0; m < matrix.length;m ++){
            for (int n = 0; n <matrix[m].length; n++){
                System.out.print(matrix[m][n]);
            }
            System.out.print("\n");
        }


    }
}
