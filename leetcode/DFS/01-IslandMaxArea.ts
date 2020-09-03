const islandMap = [
    [1, 0, 0, 1, 1, 0, 0, 1, 1, 0],
    [0, 1, 0, 1, 1, 0, 0, 0, 0, 0],
    [1, 1, 1, 1, 0, 0, 0, 1, 1, 0],
    [1, 0, 0, 0, 1, 0, 0, 0, 0, 0],
    [1, 0, 0, 0, 1, 0, 0, 1, 1, 0],
    [0, 0, 0, 0, 1, 0, 0, 0, 0, 0],
    [1, 0, 0, 1, 1, 1, 0, 1, 1, 0],
];
let max = 0;
//* 默认面积数组非空
function getSurrouding(area: Array<Array<number>>, num: number) {
    const width = area[0].length;
    const height = area.length;
    const isTop = num >= 0 && num <= width - 1 ? true : false;
    const isRight = num != 0 && (num + 1) % width == 0 ? true : false;
    const isBottom = num <= width * height - 1 && num >= width * height - width - 1 ? true : false;
    const isLeft = num % width == 0 ? true : false;
    console.log('isTop:' + isTop);
    console.log('isRight:' + isRight);
    console.log('isBottom:' + isBottom);
    console.log('isLeft:' + isLeft);
}
getSurrouding(islandMap, 20);
function maxArea(area: Array<Array<number>>, res: number) {
    //* 截止条件：结果数组中任意节点均找不到周围为1的点，岛屿地图被全部遍历完，遍历完要置0
    //* 候选人：为1的节点
}
