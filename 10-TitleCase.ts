function titleCase(str) {
    let res = [];
    let origin = str.split(' ');
    for (let element in origin) {
        res.push(origin[element].substring(0, 1).toUpperCase() + origin[element].substring(1, origin[element].length).toLowerCase());
    }
    return res.join(' ');
}
console.log(titleCase('tom case InDia'));
