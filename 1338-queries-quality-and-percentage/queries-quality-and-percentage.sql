# Write your MySQL query statement below
select  
query_name,
ROUND(AVG(RATING/POSITION),2) AS quality, 
ROUND(AVG(IF(RATING <3,1,0))*100,2) AS poor_query_percentage
from Queries 

group by query_name