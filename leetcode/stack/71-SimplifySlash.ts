function simplifySlash(str: string) {
    //* 从左到右解析
    let origin = str.split('/');
    let res = [];
    origin.forEach((item) => {
        switch (item) {
            case '..':
                res.pop();
                break;
            case '':
                break;
            case '.':
                break;
            default:
                res.push(item);
        }
    });
    const resString = '/' + res.join('/');
    console.log(resString);
    return resString;
}
simplifySlash('/usr/local/../Cellar//c/.//'); // u,s,r,l,o,c,a,l, , ,
