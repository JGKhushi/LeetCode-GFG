# Write your MySQL query statement below
SELECT max(num)  as num FROM MyNumbers WHERE(num) in (SELECT num FROM MyNumbers group by num having  count(num)=1 );