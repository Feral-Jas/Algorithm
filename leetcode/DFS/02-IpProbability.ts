//? 递归+回溯
function ipProbability(str, index, level, res) {
    //onsole.log(arr, res);
    //? 一个没有小数点的ip串string
    //? _._._._ 四个坑位 res=[_,_,_,_]
    //* 1.截止条件(str被处理完，res长度是4)
    if (level == 5 || index == str.length - 1) {
        if (level == 5 && index == str.length - 1) {
            console.log(res.join('.'));
        }
        return;
    }
    for (let i = 1; i < 4; i++) {
        //* 候选人candidate
        let candidate = str.substr(index + 1, i);
        if (parseInt(candidate) < 256 && (candidate == '0' || !candidate.startsWith('0'))) {
            res.push(candidate);
            ipProbability(str, index + i, level + 1, res);
            res.pop();
        }
    }
}
//* e.g. 19216801
//* 从index开始取，取1-3个每次都是push进去再递归
//* 第一层操作为1 19 192
//* 对应9 92 921……
//* 192.168.0.1 19.216.80.1 192.16.80.1
ipProbability('19216801', -1, 1, []);
