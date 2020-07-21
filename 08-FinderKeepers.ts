function findElement(arr: Array<number>, func) {
    let res = undefined;
    for (let element in arr) {
        if (func(element)) {
            console.log(element);
            return element;
        }
    }
}
console.log(findElement([1, 2, 3, 4], (num) => num % 2 === 0));
