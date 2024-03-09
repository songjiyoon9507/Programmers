-- 코드를 입력하세요
SELECT NAME, DATETIME
FROM (SELECT ROWNUM, I.NAME, I.DATETIME
     FROM ANIMAL_INS I, ANIMAL_OUTS O
     WHERE I.ANIMAL_ID = O.ANIMAL_ID(+)
     AND O.ANIMAL_ID IS NULL
     ORDER BY I.DATETIME)
WHERE ROWNUM <= 3;