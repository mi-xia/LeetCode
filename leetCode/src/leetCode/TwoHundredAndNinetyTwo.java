package leetCode;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/nim-game/comments/
 * @date 2020/10/12 18:54
 */
public class TwoHundredAndNinetyTwo {

    public boolean canWinNim(int n) {
        if (n == 0){
            return false;
        }

        return n % 4 != 0;
    }

}
