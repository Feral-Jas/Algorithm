import java.util.LinkedList;
import java.util.List;

public class PreorderTraversal {

    // * 先自己给定一个空LinkedList作为返回值接收对象，再对这个进行操作
    // * 本身给定的函数最好不要动，由于其自带返回值
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preOrder = new LinkedList<>();
        preOrderTraversalHelper(root, preOrder);
        return preOrder;
    }

    // * recursive解决方案
    private void preOrderTraversalHelper(TreeNode root, List<Integer> order) {
        if (root == null)
            return;
        order.add(root.val);
        preOrderTraversalHelper(root.left, order);
        preOrderTraversalHelper(root.right, order);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = null;
        node.right = new TreeNode(2);
        node.right.left = new TreeNode(5);
        List<Integer> res = new PreorderTraversal().preorderTraversal(node);
        res.forEach(item -> System.out.println(item));
    }
}
