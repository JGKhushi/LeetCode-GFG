SELECT 
    ROUND(COUNT(t2.player_id) / COUNT(t1.player_id), 2) AS fraction
FROM (
    SELECT player_id, MIN(event_date) AS first_login
    FROM Activity
    GROUP BY player_id
) t1
LEFT JOIN Activity t2
    ON t1.player_id = t2.player_id
   AND DATEDIFF(t2.event_date, t1.first_login) = 1;
   

-- | t1.player_id | first_login | t2.player_id | t2.event_date |
-- | ------------ | ----------- | ------------ | ------------- |
-- | 1            | 2016-03-01  | 1            | 2016-03-02    |
-- | 2            | 2017-06-25  | NULL         | NULL          |
-- | 3            | 2016-03-02  | NULL         | NULL          |
