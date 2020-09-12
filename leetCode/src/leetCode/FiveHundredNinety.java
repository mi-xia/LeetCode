package leetCode;

import java.util.ArrayList;
import java.util.List;

public class FiveHundredNinety {


    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }


    public List<Integer> postorder(Node root) {

        List<Integer> results = new ArrayList<Integer>();
        if (root == null)
            return results;

        return getPostOrder(root,results);

    }


    public List<Integer> getPostOrder(Node root, List results){
        if (root == null)
            return new ArrayList<Integer>();

        for (Node children : root.children) {
            getPostOrder(children,results);
        }

        results.add(root.val);
        return results;
    }






}
