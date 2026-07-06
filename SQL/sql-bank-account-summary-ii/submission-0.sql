-- Write your query below
SELECT u.name, SUM(t.amount) AS balance
FROM users u
Join transactions t
ON t.account = u.account
GROUP BY u.account
HAVING  SUM(t.amount)> 10000
