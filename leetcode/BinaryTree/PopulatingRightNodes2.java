package leetcode.BinaryTree;

import java.util.LinkedList;
import java.util.List;

public class PopulatingRightNodes2 {
    public Node Solution(Node root) {
        if (root == null) {
            return null;
        }
        // 这次估计得用BFS了，因为要找到同一层下一个next
        List<List<Integer>> headList = new LinkedList<>();
        levelOrder(root, headList, 1);
        System.out.println(headList.toString());
        return root;
    }

    private void levelOrder(Node root, List<List<Integer>> headList, int level) {
        // 先来一个笨办法，BFS遍历，构造result list 然后遍历result list构造新树
        if (root == null) {
            return;
        }
        if (level > headList.size()) {
            List<Integer> temp = new LinkedList<>();
            temp.add(root.val);
            headList.add(temp);
        } else {
            headList.get(level - 1).add(root.val);
        }
        levelOrder(root.left, headList, level + 1);
        levelOrder(root.right, headList, level + 1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(5);
        root.right.left = new Node(9);
        root.right.left.right = new Node(9);

        new PopulatingRightNodes2().Solution(root);
    }
}