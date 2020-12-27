package leetCode;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/decode-string/
 * @date 2020/12/27 21:50
 */
public class ThreeHundredAndNinetyFour {

        public String decodeString(String s) {
            StringBuilder res = new StringBuilder();
            int multi = 0;
            LinkedList<Integer> stack_mutil = new LinkedList<>();
            LinkedList<String> stack_res = new LinkedList<>();

            for (Character c : s.toCharArray()){

                if (c == '['){
                    stack_mutil.add(multi);
                    stack_res.add(res.toString());
                    multi = 0;
                    res = new StringBuilder();
                } else if (c == ']') {
                    int cur_mutil = stack_mutil.removeLast();
                    StringBuilder tmpSb = new StringBuilder();
                    for(int i = 0; i < cur_mutil; i++){
                        tmpSb.append(res);
                    }
                    res = new StringBuilder( stack_res.removeLast() + tmpSb);
                } else if (c >= '0' && c <= '9'){
                    multi = multi * 10 + Integer.parseInt(c + "");
                } else {
                    res.append(c);
                }
            }

            return res.toString();
        }

//    public String decodeString(String s) {
//
//        Stack<Character> stack = new Stack();
//
//        char[] chars = s.toCharArray();
//
//        String res = "";
//
//        for (char c : chars){
//
//            if (c == ']'){
//                char tmp = stack.pop();
//                if (tmp == ']'){
//                    tmp = stack.pop();
//                }
//                String tmpString = "";
//                while (tmp != '[') {
//                    tmpString = (tmp + tmpString);
//                    tmp = stack.pop();
//                }
//
//                int count = Integer.valueOf(stack.pop()-'0');
//                String tmpS = "";
//                while(count > 0){
//                    tmpS = (tmpString + tmpS);
//                    count--;
//                }
//                res = res+tmpS;
//            }
//            stack.push(c);
//        }
//
//        return res;
//    }
}
