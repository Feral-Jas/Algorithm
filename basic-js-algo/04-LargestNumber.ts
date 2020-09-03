function largestNumber(...array: Array<Array<number>>): Array<number> {
    let res = [];
    array.forEach((element) => {
        let currentLargest: number = element[0];
        let current: Array<number> = [];
        element.forEach((item) => {
            if (current.length == 0) {
                current.push(item);
            }
            if (item > currentLargest) {
                current.pop();
                current.push(item);
                currentLargest = item;
            }
        });
        res.push(currentLargest);
    });
    console.log(res);
    return res;
}

largestNumber([1, 2, 3, 4], [4, 1, 7, 9], [7, 9, 11, 43]);
