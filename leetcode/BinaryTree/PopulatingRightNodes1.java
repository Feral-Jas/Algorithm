package leetcode.BinaryTree;

import java.util.LinkedList;
import java.util.List;

/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
public class PopulatingRightNodes1 {
    // 注意返回条件是Node类型，意思是只要保证next的顺序是对的即可
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        // 在当前层操作下一层，先保存顶点
        Node curr = root;
        while (curr != null) {
            Node levelStart = curr;
            while (curr != null) {
                if (curr.left != null)
                    curr.left.next = curr.right;
                if (curr.next != null && curr.right != null) {
                    curr.right.next = curr.next.left;
                }
                curr = curr.next;
            }
            curr = levelStart.left;
        }
        return root;
    }
}