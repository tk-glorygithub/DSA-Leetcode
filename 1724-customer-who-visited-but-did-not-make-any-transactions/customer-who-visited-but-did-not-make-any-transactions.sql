# Write your MySQL query statement below
#Write a solution to find the IDs of the users who visited without 
#making any transactions and the number of times they made these types of visits.

select V.customer_id ,count(*) as "count_no_trans"
from VisitS V left outer join Transactions T
on V.visit_id = T.visit_id
WHERE T.TRANSACTION_ID IS NULL
GROUP BY V.CUSTOMER_ID;
