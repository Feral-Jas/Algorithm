function booWho(obj) {
    if (typeof obj === 'boolean') return true;
    else return false;
}
booWho([1, 2, 3]);
booWho('true');
booWho(false);
