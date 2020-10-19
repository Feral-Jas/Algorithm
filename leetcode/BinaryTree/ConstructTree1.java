package leetcode.BinaryTree;

import java.util.Arrays;
import java.util.HashMap;

//* Given inorder and postorder traversal of a tree, construct the binary tree.

//* Note:
//* You may assume that duplicates do not exist in the tree.

//* For example, given

//* inorder = [9,3,15,20,7]
//* postorder = [9,15,7,20,3]
//* Return the following binary tree:

//*     3
//*    / \
//*   9  20
//*     /  \
//*    15   7

public class ConstructTree1 {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null) {
            return null;
        }
        if (inorder.length != postorder.length) {
            throw new RuntimeException("e");
        }
        HashMap<Integer, Integer> inMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }
        return buildTree(inMap, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode buildTree(HashMap<Integer, Integer> inMap, int inStart, int inEnd, int[] postorder, int postStart,
            int postEnd) {
        if (inStart > inEnd || postStart > postEnd) {
            return null;
        }
        // 找到subtree里inorder中root的index
        int subRoot = postorder[postEnd];
        TreeNode root = new TreeNode(subRoot);
        int inIndex = inMap.get(subRoot);
        int subLeftSize = inIndex - 1 - inStart;
        // inStart+subLeftSize = inIndex-1
        root.left = buildTree(inMap, inStart, inIndex - 1, postorder, postStart, postStart + subLeftSize);
        root.right = buildTree(inMap, inIndex + 1, inEnd, postorder, postStart + subLeftSize + 1, postEnd - 1);
        return root;
    }

}