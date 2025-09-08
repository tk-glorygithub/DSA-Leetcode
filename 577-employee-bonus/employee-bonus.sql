# Write your MySQL query statement below
select E.name ,B.bonus
from Employee E  Left Outer join Bonus B
on E.empId = B.empId
where B.bonus <1000 Or b.BONUS IS NULL