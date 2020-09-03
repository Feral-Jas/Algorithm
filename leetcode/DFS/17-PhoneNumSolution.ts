//? 电话号码的字母组合
//? 老式键盘，输入数字，给出所有字母组合
//? e.g. "23" -- [a,b,c]X[d,e,f]
const keyboard = [
    [],
    [],
    ['a', 'b', 'c'],
    ['d', 'e', 'f'],
    ['g', 'h', 'i'],
    ['j', 'k', 'l'],
    ['m', 'n', 'o'],
    ['p', 'q', 'r', 's'],
    ['t', 'u', 'v'],
    ['w', 'x', 'y', 'z'],
];
function phoneNum(sourceStr: string, index: number, targetStr: string, res: Array<string>) {
    //* 1.截至条件
    if (index == sourceStr.length) {
        res.push(targetStr);
    }
    //? for in 的语句给定的x是遍历数组中的index，不是元素，要访问还需数组[index]的形式
    for (let x in keyboard[sourceStr.charAt(index)]) {
        const temp = targetStr;
        targetStr += keyboard[sourceStr.charAt(index)][x];
        //console.log(x);
        phoneNum(sourceStr, index + 1, targetStr, res);
        targetStr = temp;
    }
}
let res = [];
phoneNum('235', 0, '', res);
console.log(res);
