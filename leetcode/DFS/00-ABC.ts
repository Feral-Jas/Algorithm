//? 用以引入DFS的小例子：
//? 一个char数组，打印所有不重复的排列
//? [a,b,c] => [abc,acb,bca,bac,cba,cab]
function dfs(p, pb, res) {
    //* 1 截止条件:层级达到了最深层（无更深节点）
    if (res.length == p.length) {
        console.log(res.join(' '));
        return;
    }
    //* 遍历候选节点
    for (let i = 0; i < p.length; i++) {
        //* arr[i]即候选节点，但是要进行筛选
        let c = p[i];
        if (!pb[i]) {
            //* p[i]可被使用，加入到res中并标记pb[i]=true为已使用
            res.push(c);
            pb[i] = true;
            dfs(p, pb, res);
            //* 对res做改变后要撤销回去，修改res只是为了递归（回溯法）
            res.pop();
            pb[i] = false;
        }
    }
}
dfs(['a', 'b', 'c'], [false, false, false], []);
//? 简化pb和res，函数只接受一个参数数组
