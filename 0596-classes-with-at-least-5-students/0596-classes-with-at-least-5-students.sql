# Write your MySQL query statement below
SELECT class FROM Courses Group by class having count(student) >= 5;