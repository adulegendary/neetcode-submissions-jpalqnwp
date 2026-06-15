-- Write your query below
SELECT u.name, SUM(CASE WHEN r.distance IS NULL THEN 0 ELSE r.distance END)
    AS travelled_distance
FROM users u
LEFT JOIN rides r
ON r.user_id = u.id
GROUP BY r.user_id, u.name
ORDER BY travelled_distance DESC, name
