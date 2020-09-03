//? Description: leetcode 605
//? Input:[1,0,0,0,1],1 (1 refs flower 0 refs empty, plant 1 flower)
//? Output:true
//? flower can only be alive when separated

function placeFlower(flowerBed: Array<number>, flowerNum: number) {
    let maxFlower = 0;
    for (let i = 0; i < flowerBed.length; i++) {
        if (flowerBed[i] == 1) {
            continue;
        } else {
            if (i == flowerBed.length - 1 && flowerBed[i - 1] == 0) {
                flowerBed[i] = 1;
                maxFlower++;
            } else if (flowerBed[i - 1] == 0 && flowerBed[i + 1] == 0) {
                flowerBed[i] = 1;
                maxFlower++;
            } else {
                continue;
            }
        }
    }
    console.log(flowerBed);
    console.log(flowerNum, maxFlower >= flowerNum);
    return maxFlower >= flowerNum;
}
placeFlower([1, 0, 0, 1, 0, 0, 0, 1, 0, 0], 3);
