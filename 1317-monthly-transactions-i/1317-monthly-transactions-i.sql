# Write your MySQL query statement below
SELECT 
LEFT(trans_date,7) as month ,
country ,
COUNT(id) as trans_count ,
sum(case when state = "approved" then 1 else 0 end )  approved_count ,
sum(amount) as trans_total_amount ,
sum((state = 'approved')*amount) as approved_total_amount 
FROM Transactions

GROUP BY country , month ;