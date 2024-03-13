-- 코드를 입력하세요
SELECT CATEGORY, SUM(SALES) TOTAL_SALES
FROM BOOK B, BOOK_SALES S
WHERE B.BOOK_ID = S.BOOK_ID
AND TO_CHAR(SALES_DATE, 'YYYY-MM') = '2022-01'
GROUP BY CATEGORY
ORDER BY 1;