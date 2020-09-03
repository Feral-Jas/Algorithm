//? [2,3,4,7],7 => [[2,2,3],[7]]
//? 不超过最大值的组合（无重复）
function combinationSum(source: Array<number>, max: number, chain: Array<number>, res: Array<Array<number>>) {
    //* 1.截止条件

    for (let i = 0; i < source.length; i++) {
        chain.push(source[i]);
        combinationSum(source, max, chain, res);
        chain.pop();
    }
}
function Equal(chain: Array<number>, max: number) {
    let sum = 0;
    chain.forEach((item) => {
        sum += item;
        if (sum == max) return true;
    });
    return false;
}
let resw = [];
combinationSum([2, 3, 4, 7], 7, [], resw);
console.log(resw);
