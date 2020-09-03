function test(arr, res) {
    console.log(arr, res);
    if (arr.length != 0) {
        //console.log(arr.length, res);
        const head = arr[0];
        res.push(head);
        test(arr.slice(1), res);
        res.pop();
    }
}
test(['ewq', 'dsq', '1232'], []);
