# Write your MySQL query statement below
select firstName,lastName,city,state
from Person p1 Left Outer join Address a1
on p1.personId =a1.personId;