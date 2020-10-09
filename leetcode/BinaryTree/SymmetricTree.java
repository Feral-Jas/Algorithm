package leetcode.BinaryTree;

import java.util.LinkedList;
import java.util.List;

/**
 * 对称树问题
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        levelOrderHelper(root, result, 0);
        boolean isSym = true;
        for (List<Integer> item : result) {
            int end = item.size() - 1;
            if (item.size() >= 2) {
                for (int begin = 0; begin < item.size(); begin++) {
                    if (begin <= end) {
                        if (item.get(begin) != item.get(end)) {
                            isSym = false;
                        }
                    }
                    end--;
                }
            }
        }
        return isSym;

    }

    public void levelOrderHelper(TreeNode root, List<List<Integer>> result, int level) {
        // * 如果新层级还未创建，则需要先创建更深层的LinkedList，再去根据层数add元素
        if (result.size() <= level) {
            result.add(new LinkedList<>());
        }
        // * 这里注意一点，List<Integer>里是可以add null值的，这点太基础了，竟然不太清楚
        // * 之前testcase失败是因为如果本节点为空，认为得添加一个Integer类型的，所以添加了个0，如果本层中本来就有0那肯定出错
        if (root == null) {
            result.get(level).add(null);
            return;
        }
        result.get(level).add(root.val);
        levelOrderHelper(root.left, result, level + 1);
        levelOrderHelper(root.right, result, level + 1);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(4);
        node.right.left = new TreeNode(4);
        node.right.right = new TreeNode(3);
        TreeNode node1 = new TreeNode(1);
        node1.left = new TreeNode(0);
        System.out.println(new SymmetricTree().isSymmetric(node1));
    }
}