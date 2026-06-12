-- Write your query below
SELECT name
FROM customers c
WHERE NOT EXISTS  (
    SELECT id
    FROM orders o
    WHERE o.customer_id = c.id
);