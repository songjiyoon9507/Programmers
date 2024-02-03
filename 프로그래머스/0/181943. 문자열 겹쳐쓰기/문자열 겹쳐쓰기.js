function solution(my_string, overwrite_string, s) {
    // 빈 문자열 만들기
    let str = [];
    // 빈 문자열에 my_string 넣고
    // 문자열을 배열로 반환 split 함수 사용
    str = my_string.split("");
    // str 배열에서 splice 메서드 사용
    // splice 배열에서 기존 요소 삭제, 교체, 새 요소 추가
    // splice(배열 시작점, 삭제 요소의 수, 배열에 추가할 요소,...)추가할 요소는 뒤에 ,로 쭉 나열할 수 있음
    str.splice(s, overwrite_string.length, overwrite_string)
    // 배열을 문자열로 합쳐서 return 반환 시켜주기
    return str.join("");
    console.log(str);
}