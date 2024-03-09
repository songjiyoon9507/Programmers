-- 코드를 입력하세요
SELECT FLAVOR
FROM (SELECT F.FLAVOR, F.TOTAL_ORDER + J.TOTAL_ORDER TOTAL
     FROM FIRST_HALF F, (SELECT FLAVOR, SUM(TOTAL_ORDER) TOTAL_ORDER
                        FROM JULY
                        GROUP BY FLAVOR) J
     WHERE F.FLAVOR = J.FLAVOR
     ORDER BY 2 DESC)
WHERE ROWNUM <= 3;
