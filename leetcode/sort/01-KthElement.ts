//? Description: Kth Element in Array - leetcode 215

function kthElement1(arr: Array<number>, k: number) {
    arr.sort();
    console.log(arr[k]);
    return arr[k];
}

function kthElement2(arr: Array<number>, k: number) {}
