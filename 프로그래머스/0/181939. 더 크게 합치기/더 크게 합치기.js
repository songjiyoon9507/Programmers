function solution(a, b) {
    
    let num1 = `${a}${b}`
    let num2 = `${b}${a}`
    
    // console.log (num1,num2);
    
    if (num1 >= num2) {
        return Number(num1);
    } else {
        return Number(num2);
    }
    
}