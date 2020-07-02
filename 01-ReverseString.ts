// 反转字符串
// 最基本的就是遍历然后交换
// JS中string是mutual的，不可通过index来赋值
// string转数组，再进行操作 str.split ————大概是大多数处理字符串的解决方案了
// 操作完后再转成string  arr.join

function reverseString01(str: string): string {
  let arr: Array<string> = str.split("");
  let i: number = 0;
  while (i <= Math.floor(arr.length / 2)) {
    let j: number = arr.length - i - 1;
    [arr[i], arr[j]] = [arr[j], arr[i]];
    i++;
  }
  return arr.join("");
}

function reverseString02(str: string): string {
  return str.split("").reverse().join("");
}

function reverseString03(str: string): string {
  if (!str) {
    return "";
  }
  if (str.length === 1) {
    return str;
  }
  let end: number = str.length - 1;
  //slice方法头尾都不包含
  return str[end] + reverseString03(str.slice(1, end)) + str[0];
}

//custom function
console.log(reverseString01("hello world"));
//provided function
console.log(reverseString02("hello vscode"));
//recursion
console.log(reverseString03("bravo apple"));
