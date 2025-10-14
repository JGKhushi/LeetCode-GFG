# Write your MySQL query statement below
SELECT e.name , b.bonus From Employee e LEFT JOIN  Bonus b on e.empId = b.empId  WHERE b.bonus < 1000 || b.bonus IS NULL ;