-- Write your query below
Select employee_id, Case When employee_id%2=1 And name NOT LIKE 'M%' THEN salary ELSE 0 END AS bonus FROM employees ORDER BY employee_id;