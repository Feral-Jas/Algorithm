package leetcode.BinaryTree;

import java.util.Arrays;

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
    int in;
    int post;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        in = postorder.length - 1;
        post = postorder.length - 1;
        return build(inorder, postorder, -23123);
    }

    private TreeNode build(int[] inorder, int[] postorder, int stop) {
        if (in < 0 || post < 0)
            return null;
        // finish building right
        // to distinguish left subtree and right subtree
        if (inorder[in] == stop) {
            in--;
            return null;
        }
        TreeNode node = new TreeNode(postorder[post]);
        post--;
        node.right = build(inorder, postorder, node.val);
        node.left = build(inorder, postorder, stop);
        return node;
    }
}