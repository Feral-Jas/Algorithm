//? Description:
//? grid array for child's greedy ratio
//? size array for cookies' size
//? only if a cookie's size is larger than grid, a certain child will get satisfied
//? we want max satisfied children solution

//* Key Solution:
//* each cookie should satisfy a child with its minimum requirement(no waste)
//* so we satisfy children sorted by greedy ratio(ascending)

function assignCookies(grid: Array<number>, size: Array<number>) {
    grid = grid.sort();
    size = size.sort();
    console.log(grid);
    console.log(size);
    let gridIndex = 0,
        sizeIndex = 0,
        count = 0;
    while (gridIndex <= grid.length && sizeIndex <= size.length) {
        if (grid[gridIndex] <= size[sizeIndex]) {
            console.log('kid ' + gridIndex + ' cookie ' + sizeIndex + ' satisfied');
            gridIndex++;
            sizeIndex++;
            count++;
        } else {
            sizeIndex++;
            console.log('kid ' + gridIndex + ' cookie ' + sizeIndex + ' not satisfied');
        }
    }
    console.log(count);
    return count;
}

assignCookies([2, 7, 8, 5], [2, 3, 4, 5, 6]);
