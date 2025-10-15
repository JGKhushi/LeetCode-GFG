# Write your MySQL query statement below
SELECT r.contest_id , 
ROUND(
    (
        (
            (COUNT(distinct(r.user_id)))
            /(SELECT COUNT(*) FROM Users)
        ) * 100
    )
    ,2) AS percentage
FROM  Register r  
group by r.contest_id
order by percentage DESC , r.contest_id ASC ;