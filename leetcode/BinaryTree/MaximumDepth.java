package leetcode.BinaryTree;

public class MaximumDepth {
    public int depth;

    public int maxDepth(TreeNode root) {
        depth = 0;
        calDepth(root, 0);
        return depth;
    }

    public void calDepth(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level + 1 > depth) {
            depth = level + 1;
        }
        calDepth(root.left, level + 1);
        calDepth(root.right, level + 1);
    }
}