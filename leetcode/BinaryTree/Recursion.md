In previous sections, we have introduced how to solve tree traversal problems recursively. Recursion is one of the most powerful and frequently used techniques for solving tree problems.

As we know, a tree can be defined recursively as a node(the root node) that includes a value and a list of references to children nodes. Recursion is one of the natural features of a tree. Therefore, many tree problems can be solved recursively. For each recursive function call, we only focus on the problem for the current node and call the function recursively to solve its children.

Typically, we can solve a tree problem recursively using a top-down approach or using a bottom-up approach.

递归是处理树问题常用的思路，每次递归我们只关心当前节点及其子树的状态

## "Top-down" Solution

"Top-down" means that in each recursive call, we will visit the node first to come up with some values, and pass these values to its children when calling the function recursively. So the "top-down" solution can be considered as a kind of preorder traversal. To be specific, the recursive function `top_down(root, params)` works like this:

1. return specific value for null node
2. update the answer if needed // answer <-- params
3. left_ans = top_down(root.left, left_params) // left_params <-- root.val, params
4. right_ans = top_down(root.right, right_params) // right_params <-- root.val, params
5. return the answer if needed // answer <-- left_ans, right_ans

后三步处理的顺序决定了遍历次序，不过一般处理问题涉及到 preorder，如经典最大深度问题`maximum_depth(root, depth)`

## "Bottom-up" Solution

"Bottom-up" is another recursive solution. In each recursive call, we will firstly call the function recursively for all the children nodes and then come up with the answer according to the returned values and the value of the current node itself. This process can be regarded as a kind of postorder traversal. Typically, a "bottom-up" recursive function bottom_up(root) will be something like this:

1. return specific value for null node
2. left_ans = bottom_up(root.left) // call function recursively for left child
3. right_ans = bottom_up(root.right) // call function recursively for right child
4. return answers // answer <-- left_ans, right_ans, root.val
