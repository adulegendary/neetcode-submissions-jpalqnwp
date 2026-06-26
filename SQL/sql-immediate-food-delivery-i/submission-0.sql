-- Write your query below
SELECT  ROUND(100.00* SUM(
    CASE WHEN customer_pref_delivery_date = order_date THEN 1 ELSE 0 END
   
)/COUNT(*), 2) AS immediate_percentage
FROM delivery;
