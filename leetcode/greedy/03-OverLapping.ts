//? Description: BurstBalloon
//? notice [1,2] has 2 balloons
//? 02 for non-overlapping question, this one for overlapping
//? simply return every array with tail minus head
//? find every largest range at same head

function overLapping(input: Array<Array<number>>) {
    if (input.length <= 1) return 0;
    input.sort((pre: Array<number>, suf: Array<number>) => {
        if (pre[0] <= suf[0]) return -1;
        else return 1;
    });
    let count = input[0][1] - input[0][0] + 1;
    let rangeTail = input[0][1];

    input.forEach((item) => {
        if (item[0] <= rangeTail) {
            if (item[1] > rangeTail) {
                //* expand range
                count += item[1] - rangeTail;
                rangeTail = item[1];
            }
        } else {
            count += item[1] - item[0] + 1;
            rangeTail = item[1];
        }
    });
    return count;
}

overLapping([
    [5, 6],
    [1, 3],
    [2, 4],
]);
