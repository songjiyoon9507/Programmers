function solution(a, b) {
    let num1 = `${a}${b}`
    let num2 = 2*a*b;
    
    if (num1 >= num2) {
        return Number(num1);
    } else {
        return num2;
    }
}