-- 코드를 입력하세요
SELECT MCDP_CD "진료과 코드", COUNT(*) "5월예약건수"
FROM APPOINTMENT
WHERE TO_CHAR(APNT_YMD, 'YYYY-MM-DD') BETWEEN '2022-05-01' AND '2022-05-31'
GROUP BY MCDP_CD
ORDER BY 2, 1;