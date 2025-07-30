create database Capgeminii;
USE Capgeminii;
CREATE TABLE employees (
  id INT ,
  name VARCHAR(100),
 profile VARCHAR(100),
  email VARCHAR(100),
  salary INT,
  age INT,
  experience INT
);
INSERT INTO employees (id,name,profile,email,salary,age,experience)
VALUES('1','Rani','dev','rani@gmail.com','11000','43','27'),
('2','raj','test','raj@gmail.com','21000','33','17'),
('3','radha','test','radha@gmail.com','26000','38','21'),
('4','raj','dev','raj12@gmail.com','51000','32','12'),
('5','jhone','dev','jhone@gmail.com','51000','39','27');
show tables;

-- 1. As a user, I want to add an column branch_location so I can efficiently search the branch wise record.
alter table employees add branch_location text;

-- Q.2: As a user, I want to check the total salary expenses on employees
SELECT salary FROM employees;
SELECT SUM(salary)  FROM employees;


-- Q.3: 3. As a user, I want to see the max salary of employee from test profile.
SELECT MAX(salary) FROM employees WHERE profile = 'test';

-- Q.4: As a user I want to get the average experience level of employees.
SELECT AVG(experience)  FROM employees;

-- Q.5: As a user I want to see the name of highest paid employee
SELECT name FROM employees WHERE salary = (SELECT MAX(salary) FROM employees);

-- Q.6: As a user, I want to see the name and experience of lowest paid employee.
SELECT name FROM employees WHERE salary = (SELECT MIN(salary) FROM employees);
-- Q.7: As a user I want check how many employees are working in company.
SELECT COUNT(*) FROM employees;

-- Q.8: As a user I want to see those employee names who are from test profile and having salary more than 25K.
SELECT name FROM employees WHERE profile = 'test' AND salary >25000 ;

-- Q.9: As a user, I want to shift Radha on support profile.
set SQL_SAFE_UPDATES =0;
UPDATE employees SET profile = 'support' WHERE name = 'Radha';

-- Q.10: As a user, I want to get the second highest salary of employee.

-- Q.11: As a user I want to get the second lowest salary of employee.

-- Q.12: As a user, I want to calculate the average salary of employees those are belongs to dev profile.
SELECT AVG(salary) FROM employees WHERE profile = 'dev';

-- Q.13: As a user, I want to see the employee's name and salary who is having lowest experience.
SELECT name, salary FROM employees WHERE experience = (SELECT MIN(experience) FROM employees);

-- Q.14: As a user, I want to see the employee name who is having lowest age with max salary.
SELECT name FROM employees WHERE age = (SELECT MIN(age) FROM employees) AND salary = (SELECT MAX(salary) FROM employees);

-- Q.15: As a user, I want to remove all the employee from company
DELETE FROM employee;
