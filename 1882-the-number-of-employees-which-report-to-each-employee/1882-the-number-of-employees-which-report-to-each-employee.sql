# Write your MySQL query statement below
/* Write your PL/SQL query statement below */
-- SELECT E1.employee_id, E1.name, COUNT(E2.employee_id)  reports_count,

-- ROUND(AVG(E2.age)) average_age FROM Employees E1 INNER JOIN Employees 

-- E2 ON E1.employee_id = E2.reports_to GROUP BY E1.employee_id, E1.name 

-- ORDER BY E1.employee_id

SELECT E1.employee_id,
       E1.name,
       COUNT(E2.employee_id)        AS reports_count,
       ROUND(AVG(E2.age))          AS average_age
FROM Employees E1
LEFT JOIN Employees E2
  ON E2.reports_to = E1.employee_id
GROUP BY E1.employee_id, E1.name
HAVING COUNT(E2.employee_id) > 0
ORDER BY E1.employee_id;
