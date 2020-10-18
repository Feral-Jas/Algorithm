package leetcode.BinaryTree;

import java.util.Arrays;
import java.util.HashMap;

// Given preorder and inorder traversal of a tree, construct the binary tree.

// Note:
// You may assume that duplicates do not exist in the tree.

// For example, given

// preorder = [3,9,20,15,7]
// inorder = [9,3,15,20,7]
// Return the following binary tree:

//     3
//    / \
//   9  20
//     /  \
//    15   7
public class ConstructTree2 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null)
            return null;
        if (preorder.length != inorder.length)
            throw new RuntimeException("error");
        HashMap<Integer, Integer> inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return buildTree(preorder, 0, preorder.length - 1, inorderMap, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int preStart, int preEnd, HashMap<Integer, Integer> inorderMap,
            int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd)
            return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int inIndex = inorderMap.get(preorder[preStart]);

        root.left = buildTree(preorder, preStart + 1, preStart + inIndex - inStart, inorderMap, inStart, inIndex - 1);
        root.right = buildTree(preorder, preStart + inIndex - inStart + 1, preEnd, inorderMap, inIndex + 1, inEnd);
        return root;
    }

}