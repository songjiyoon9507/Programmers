function solution(str1, str2) {
    let result = '';
    
    // let arr = [];
    
    // let arr1 = [];
    // arr1 = str1.split('');
    // console.log(arr1);
    
    // let arr2 = [];
    // arr2 = str2.split('');
    // console.log(arr2);
    
    for (let i = 0 ; i < str1.length ; i++) {
        result += (str1[i] + str2[i]);
        // console.log(result);  
    }
    // console.log(result);
    // 문자열로 반환
    return result
}