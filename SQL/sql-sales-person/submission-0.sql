-- Write your query below
SELECT name
FROM sales_person s
WHERE s.sales_id NOT IN(
    SELECT o.sales_id 
    FROM company c
    JOIN orders o
    ON o.com_id = c.com_id
    WHERE c.name = 'CRIMSON'
)