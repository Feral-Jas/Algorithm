package leetcode.BinaryTree;

public class PathSum {
    public boolean res;

    public boolean hasPathSum(TreeNode root, int sum) {
        // 如果遍历到本身为空，代表上一层实际上不等于sum，没有必要在此做判断
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return sum == root.val;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        System.out.println(new PathSum().hasPathSum(node, 1));
    }
}