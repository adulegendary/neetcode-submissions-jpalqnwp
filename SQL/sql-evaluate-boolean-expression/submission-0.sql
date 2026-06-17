SELECT e.left_operand, e.operator, e.right_operand,
      CASE 
        WHEN e.operator = '>' AND v.value > v2.value THEN 'true'
        WHEN e.operator = '<' AND v.value < v2.value THEN 'true'
        WHEN e.operator = '=' AND v.value = v2.value THEN 'true'
        ELSE 'false'
       END AS value
from expressions e
JOIN variables v
ON v.name = e.left_operand 
JOIN variables V2
ON V2.name = e.right_operand

