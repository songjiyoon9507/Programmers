const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = [line];
}).on('close',function(){
    str = input[0];
    // let arr = str.split('');
    // console.log(str[0]);
    // console.log(str.length);
    for (let i = 0 ; i < str.length ; i++) {
        console.log(str[i]);
    }
});