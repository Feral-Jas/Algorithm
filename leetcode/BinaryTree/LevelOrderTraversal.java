package leetcode.BinaryTree;

import java.util.LinkedList;
import java.util.List;

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        levelOrderHelper(root, result, 0);
        return result;
    }

    public void levelOrderHelper(TreeNode root, List<List<Integer>> result, int level) {
        if (root == null) {
            return;
        }
        // * 如果新层级还未创建，则需要先创建更深层的LinkedList，再去根据层数add元素
        if (result.size() <= level) {
            result.add(new LinkedList<>());
        }
        result.get(level).add(root.val);
        levelOrderHelper(root.left, result, level + 1);
        levelOrderHelper(root.right, result, level + 1);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(5);
        node.right.right = new TreeNode(7);
        System.out.println(new LevelOrderTraversal().levelOrder(node).toString());
    }
}