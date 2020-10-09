package leetcode.BinaryTree;

import java.util.LinkedList;
import java.util.List;

public class PostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        traversalHelper(root, result);
        return result;
    }

    public void traversalHelper(TreeNode root, LinkedList<Integer> result) {
        if (root == null) {
            return;
        }
        /**
         * 总结下来其实就是以下三行的不同 可以理解为处理子树的顺序代表了插入result链表的顺序
         */
        traversalHelper(root.left, result);
        traversalHelper(root.right, result);
        result.add(root.val);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.left = new TreeNode(5);
        // 1
        // 2 3
        // 5
        List<Integer> res = new PostorderTraversal().postorderTraversal(node);
        res.forEach(item -> System.out.println(item));
    }
}