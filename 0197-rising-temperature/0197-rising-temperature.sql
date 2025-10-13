# Write your MySQL query statement below
SELECT w2.id FROM Weather AS w1, Weather AS w2 WHERE DATEDIFF(w2.recordDate , w1.recordDate)= 1 AND w1.temperature < w2.temperature;