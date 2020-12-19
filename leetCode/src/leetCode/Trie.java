package leetCode;

import com.google.common.primitives.Chars;
import com.sun.xml.internal.fastinfoset.util.CharArray;

/**
 * @author 邹磊
 * @version 1.0 TwoHundredAndEight
 * @description: https://leetcode-cn.com/problems/implement-trie-prefix-tree/
 * @date 2020/12/20 0:20
 */
public class Trie {

    class TreeNode{

        private Boolean isEnd;
        private TreeNode[] nodes;

        public TreeNode(){
            isEnd = false;
            nodes = new TreeNode[26];
        }

    }

    private TreeNode root;

    /** Initialize your data structure here. */
    public Trie() {
        root = new TreeNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        char[] wordChars = word.toCharArray();
        TreeNode curNode = root;
        for (char s : wordChars) {
            int index = s -'a';
            if (curNode.nodes[index] == null){
                TreeNode tmpNode = new TreeNode();
                curNode.nodes[index] = tmpNode;
            }
            curNode = curNode.nodes[index];
//            curNode.isEnd = false;
        }
        curNode.isEnd = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        char[] wordChars = word.toCharArray();
        TreeNode curNode = root;
        for (char s : wordChars) {
            int index = s - 'a';
            if (curNode.nodes[index] == null){
                return false;
            }
            curNode = curNode.nodes[index];
        }
        return curNode.isEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        char[] wordChars = prefix.toCharArray();
        TreeNode curNode = root;
        for (char s : wordChars) {
            int index = s - 'a';
            if (curNode.nodes[index] == null){
                return false;
            }
            curNode = curNode.nodes[index];
        }
        return true;
    }

}
