# Write your MySQL query statement below
DELETE P
FROM PERSON  p join person P1
ON P.EMAIL = P1.EMAIL 
AND P.ID > P1.ID;
