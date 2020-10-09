package leetcode.BinaryTree;

import java.util.LinkedList;
import java.util.List;

public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        traversalHelper(root, result);
        return result;
    }

    public void traversalHelper(TreeNode root, LinkedList<Integer> result) {
        if (root == null)
            return;
        traversalHelper(root.left, result);
        result.add(root.val);
        traversalHelper(root.right, result);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.left = new TreeNode(5);
        // 1
        // 2 3
        // 5
        List<Integer> res = new InorderTraversal().inorderTraversal(node);
        res.forEach(item -> System.out.println(item));
    }
}