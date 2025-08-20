create database joins;

use joins;

CREATE TABLE departments (
    id INT PRIMARY KEY,
    dept_name VARCHAR(50)
);

CREATE TABLE employees (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    dept_id INT,
    FOREIGN KEY (dept_id) REFERENCES departments(id)
);

INSERT INTO departments (id, dept_name) VALUES
(10, 'HR'),
(20, 'IT'),
(40, 'Marketing');

INSERT INTO employees (id, name, dept_id) VALUES
(1, 'Alice', 10),
(2, 'Bob', 20),
(3, 'Charlie', NULL);


-- Inner join:
SELECT e.name, d.dept_name
FROM employees e
INNER JOIN departments d ON e.dept_id = d.id;

-- Left join:
SELECT e.name, d.dept_name
FROM employees e
LEFT JOIN departments d ON e.dept_id = d.id;

-- Right join:
SELECT e.name, d.dept_name
FROM employees e
RIGHT JOIN departments d ON e.dept_id = d.id;

-- FULL Outer join:
SELECT e.name, d.dept_name
FROM employees e
LEFT JOIN departments d ON e.dept_id = d.id
UNION
SELECT e.name, d.dept_name
FROM employees e
RIGHT JOIN departments d ON e.dept_id = d.id;

-- Cross join:
SELECT e.name, d.dept_name
FROM employees e
CROSS JOIN departments d;

-- Self join:
SELECT e1.name AS emp1, e2.name AS emp2
FROM employees e1
JOIN employees e2 ON e1.dept_id = e2.dept_id
WHERE e1.id < e2.id;
