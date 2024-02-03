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
    
    let arr = [];
    arr = str.split("");
    // console.log(arr);
    for (let i = 0; i < arr.length; i++) {
       if (arr[i] == arr[i].toUpperCase()) {
           arr[i] = arr[i].toLowerCase();
       } else {
           arr[i] = arr[i].toUpperCase();
       }
    }
    str = arr.join('');
    console.log(str);
});