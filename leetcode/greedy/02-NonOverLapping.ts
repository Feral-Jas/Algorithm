//? Description:
//? Input: Array<Array<number>>
//? e.g. [[1,2],[1,2],[1,2]] need to remove 2 extra [1,2] to fit non-overlapping so res = 2
//? e.g. [[1,2],[2,3]] no need to remove anything so res = 0

//* Key solution

function nonOverLapping(input: Array<Array<number>>) {
    // input.sort((pre: Array<number>, suf: Array<number>) => {
    //     if (pre[0] < suf[0]) {
    //         return -1;
    //     } else if (pre[0] == suf[0]) {
    //         if (pre[1] < suf[1]) return -1;
    //         else return 1;
    //     } else {
    //         return 1;
    //     }
    // });
    //* the ending is the most important params involved
    //* we choose to sort by the ending
    if (input.length <= 1) return 0;
    input.sort((pre: Array<number>, suf: Array<number>) => {
        if (pre[1] <= suf[1]) return -1;
        else return 1;
    });
    let count = 1;
    let rangeTail = input[0][1];
    input.forEach((item) => {
        if (item[0] > rangeTail) {
            count++;
            rangeTail = item[1];
        }
    });
    console.log(input.length - count);
}

nonOverLapping([
    [5, 6],
    [1, 2],
    [3, 4],
    [1, 3],
    [2, 4],
    [2, 5],
]);
