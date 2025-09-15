# Write your MySQL query statement below
SELECT x ,y , z , if 
(x + y > z &&
y+z > x&&
z + x > y, "Yes" , "No"
) AS triangle from Triangle ;