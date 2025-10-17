# Write your MySQL query statement below
SELECT c.customer_id FROM Customer as c  
group by customer_id 
having 
COUNT( distinct c.product_key ) = (SELECT COUNT(*) FROM Product)