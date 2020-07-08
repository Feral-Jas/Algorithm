//*using built in repeat funciton
function repeatString(str, num) {
    let res = '';
    for (let i = 1; i <= num; i++) {
        res += str;
    }
    return res;
}
function repeatStringWrap(str, num: number): string {
    return str.repeat(num);
}
console.log(repeatString('abc', 3));
