function longestWord(str: string): number {
    const wordList = str.split(' ');
    let longest = 0;
    wordList.forEach((word) => {
        if (word.length > longest) longest = word.length;
    });
    console.log(longest);
    return longest;
}

longestWord('The quickest doggy');
