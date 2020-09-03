let result: Array<Object> = [];
function fullPermute(arr: Array<number>, arrB: Array<boolean>, chain: Array<number>, res) {
    //* 1.截至条件
    if (chain.length == arr.length) {
        console.log(chain);
        res.push(chain);
        return res;
    }
    //* arrB记录已被使用的index，初始值是[false,false]
    for (let i = 0; i < arr.length; i++) {
        let pi = arr[i];
        if (!arrB[i]) {
            chain.push(pi);
            arrB[i] = true;
            fullPermute(arr, arrB, chain, res);
            arrB[i] = false;
            chain.pop();
        }
    }
}
fullPermute([1, 2, 3], [false, false, false], [], result);
//* 不知道为啥数组中不能push数组，再研究一下
console.log(result);
