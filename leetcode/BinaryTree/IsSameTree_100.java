package leetcode.BinaryTree;

import java.util.Objects;

//* 先if && 再if || 的处理方法 可以学习以下
public class IsSameTree_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (Objects.isNull(p) && Objects.isNull(q)) {
            return true;
        }
        //这样处理的高明之处就在于进入下面的if时一定是其中一个是null的情况
        if(Objects.isNull(p)||Objects.isNull(q)){
            return false;
        }
        //上面两个if已经过滤掉了pq中为空的情况，下面即pq均非空的情况
        return p.val==q.val?isSameTree(p.left, q.left)&&isSameTree(p.right, q.right):false;
    }
}