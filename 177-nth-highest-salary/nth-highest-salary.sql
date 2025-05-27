CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  
    DECLARE offsetValue INT;
  SET offsetValue = N - 1;

  RETURN (
      # Write your MySQL query statement below.

 
SELECT  salary
FROM(

     SELECT DISTINCT salary
     FROM Employee
     ORDER BY salary DESC)
     AS temp

                    LIMIT offsetValue, 1

  );
END