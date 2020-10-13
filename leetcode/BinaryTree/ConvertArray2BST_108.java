package leetcode.BinaryTree;

public class ConvertArray2BST_108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return null;
        }
        return convertHelper(nums, 0, nums.length - 1);
    }

    // 对于一个排好序的数组，总是想到binary search就对了
    public TreeNode convertHelper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        if (left == right) {
            return new TreeNode(nums[left]);
        }
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        // 本题目可以看出带返回值的recursion怎么写，首先要初始化一个返回值，即root节点
        // 然后操作左子树和右子树
        // 最后返回root节点
        // 此类问题写法基本类似
        root.left = convertHelper(nums, left, mid - 1);
        root.right = convertHelper(nums, mid + 1, right);
        return root;
    }
}