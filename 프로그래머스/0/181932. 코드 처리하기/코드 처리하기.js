function solution(code) {

    let ret = '';
    let mode = 0;
    
    for (let idx = 0; idx <= code.length-1 ; idx++) {
        // code[idx]의 값에 따라 다음과 같이 행동
        if (code[idx] == '1') mode == 0 ? mode = 1 : mode = 0;
        // code[idx]가 1일 때 mode가 0 이면 1로 1이면 0으로 바뀜
        if (mode == 0) {
            if (code[idx] != '1' && idx % 2 == 0) {
                ret += code[idx];
            }
        }
        if (mode == 1) {
            if (code[idx] != '1' && idx % 2 == 1) {
                ret += code[idx];
            }
        }      
    } return ret == '' ? "EMPTY" : ret ;
    
}