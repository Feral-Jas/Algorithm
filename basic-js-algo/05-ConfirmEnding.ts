function confirmEnding(str, target) {
    const strArr = str.split('');
    let targetArr = target.split('');
    let isFit = true;
    while (isFit) {
        if (targetArr.length == 0) {
            return true;
        }
        if (strArr.pop() != targetArr.pop()) {
            return false;
        }
    }
}
//*can be solved with endWith function

function confirmEndingWrap(str, target) {
    return str.endsWith(target);
}

console.log(confirmEnding('James', ' '));
console.log(confirmEndingWrap('James', 'es'));
