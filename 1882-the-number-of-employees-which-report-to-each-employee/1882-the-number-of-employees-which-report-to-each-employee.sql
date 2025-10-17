# Write your MySQL query statement below
SELECT e1.employee_id , e1.name , count( e2.employee_id ) as reports_count ,   ROUND(AVG(e2.age)) AS average_age
from Employees as e1 LEFT JOIN  Employees as e2
on  e1.employee_id =  e2.reports_to 
GROUP BY e1.employee_id  having reports_count > 0
order by e1.employee_id ;  