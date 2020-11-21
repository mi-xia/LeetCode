package leetCode;


import java.util.ArrayList;
import java.util.List;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/word-search/
 * @date 2020/11/17 11:34
 */
public class SeventyNine {

    List<Boolean> res = new ArrayList<>();

    public boolean exist(char[][] board, String word) {

        Boolean f = false;

        for (int j = 0; j < board.length; j++){
            if (res.size() > 0){
                break;
            }
            for (int i = 0; i < board[0].length; i++){
                if (res.size() > 0){
                    break;
                }
                if (board[j][i] == word.charAt(0)){
                    doExit(board,i,j,word,0,f, new boolean[board.length][board[0].length]);
                }
            }
        }

        return res.size() > 0;
    }


    public void doExit(char[][] board, int i, int j, String word, int index, Boolean flag, boolean[][] tmp){

        if (res.size() > 0){
            return;
        }

        if (index >= word.length()){
            res.add(new Boolean(true));
            return;
        }

        if (i < 0 || i >= board[0].length){
            return;
        }

        if (j < 0 || j >= board.length ){
            return;
        }

        if (tmp[j][i]){
            return;
        }

        if (board[j][i] != word.charAt(index)){
            return;
        }

        tmp[j][i] = true;

        doExit(board, i, j-1, word, index+1, flag, tmp);
        doExit(board, i+1, j, word, index+1, flag, tmp);
        doExit(board, i, j+1, word, index+1, flag, tmp);
        doExit(board, i-1, j, word, index+1, flag, tmp);

        tmp[j][i] = false;

    }


}
