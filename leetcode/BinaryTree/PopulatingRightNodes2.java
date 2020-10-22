package leetcode.BinaryTree;

public class PopulatingRightNodes2 {
    public Node Solution(Node root) {
        Node real_root = root;
        Node dummyNode = new Node(0);
        Node pre = dummyNode;
        while (root != null) {
            if (root.left != null) {
                pre.next = root.left;
                pre = pre.next;
            }
            if (root.right != null) {
                pre.next = root.right;
                pre = pre.right;
            }
            if (root.next != null) {
                root = root.next;
            } else {
                // root下移到子节点（假头的next）
                root = dummyNode.next;
                dummyNode.next = null;
                pre = dummyNode;
            }
        }
        return real_root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(5);
        root.right.left = new Node(9);
        root.right.left.right = new Node(9);

        new PopulatingRightNodes2().Solution(root);
    }
}