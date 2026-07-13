SELECT seat_id
FROM (
    SELECT *,
           LAG(free) OVER (ORDER BY seat_id) AS prev,
           LEAD(free) OVER (ORDER BY seat_id) AS next_free
    FROM Cinema
) t
WHERE free = 1
  AND next_free = 1 OR free =1 AND prev = 1

 ORDER BY seat_id ASC  