# Write your MySQL query statement below
select unique_id ,name
from Employees E LEFT OUTER JOIN EmployeeUNI D
ON E.id = D.id