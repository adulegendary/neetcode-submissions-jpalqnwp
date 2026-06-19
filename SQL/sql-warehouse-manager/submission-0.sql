-- Write your query below
SELECT w.name AS warehouse_name, SUM(w.units*p.length*p.width*p.height) AS volume
FROM warehouse w
JOIN products p
ON p.product_id = w.product_id
GROUP BY w.name
