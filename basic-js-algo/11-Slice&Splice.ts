function frankenSplice(arr1, arr2, n) {
    let head = arr2.slice(0, n);
    let tail = arr2.slice(n);
    return [...head, ...arr1, ...tail];
}
console.log(frankenSplice([1, 2, 3], [4, 5, 6], 1));
