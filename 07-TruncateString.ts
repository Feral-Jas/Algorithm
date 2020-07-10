function truncateString(str: string, num: number): string {
    if (num >= str.length) return str;
    else return str.substring(0, num) + '...';
}

console.log(truncateString('A-tisket a-tasket A green and yellow basket', 'A-tisket a-tasket A green and yellow basket'.length));
console.log(truncateString('A-', 8));
console.log(truncateString('Jackit,Kivin', 8));
