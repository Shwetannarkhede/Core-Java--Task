create database infosys;
USE infosys;
drop table emp;
CREATE TABLE emp (
  id INT ,
  Name VARCHAR(100),
  salary INT,
 Department VARCHAR(100),
 
Location VARCHAR(100)
);

INSERT INTO emp (id,Name,salary,Department ,Location)
VALUES('1','Anup','10000','dev','pune'),
('2','rani','26000','test','nashik'),
 ('3','jay','18000','dev','nagpur'),
 ('4','vishal','22000','support','pune'),
  ('5','shina','35000','test','nagpur'),
('6','rony','11000','support','nagpur'),
  ('7','pooja','38000','dev','nashik');
   set SQL_SAFE_UPDATES =0;
  update  emp set Department ='dev' where   Department ='Dev';
  select * from emp;
  -- 1. What are the names of all employees?
   select name from emp;
   
   -- 2. How many employees are there in total?
   select count(name) from emp;
   
 -- 3. What departments do the employees work in?
 select name,Department from emp;
 
 -- 4. How many employees work in each department?
SELECT Department, COUNT(*) AS total_employees FROM emp GROUP BY Department;

--  5. Who is the highest-paid employee?
select max(salary) from emp;

-- 6. Who is the lowest-paid employee?
select min(salary),name from emp;

-- 7. How many employees earn more than RS 20000 per year?
select  count(name) from emp where salary >'20000';

-- 8. What is the average salary of all employees?
select avg(salary) from emp;

-- 9. Who are the top 5 highest-paid employees?
select name from emp order by salary DESC limit 5;

-- 10. Who are the employees in the Marketing department?
select name from emp where Department ='support';

-- 11. How many employees have a salary between RS 15000 and RS 25000?
select count(name) from emp where salary between  15000 and 25000;

-- 12. Who are the employees with a salary of NULL?
select name from emp where salary = 'NuLL';

-- 13. Who are the employees with a first name starting with "J"?
SELECT name FROM emp WHERE name LIKE 'J%';

-- select name from emp where name  = 'j';

-- 14. What are the salaries of all employees sorted in descending order?
-- select name from emp where salary 
SELECT * FROM emp  ORDER BY  salary  desc;


-- 15. What is the total salary expenditure of the company?
select sum(salary) from emp;

-- 16. Who are the employees with the same first names?

-- 17. How many employees are there in Pune location?
select count(name) from emp where Location ='pune';

-- 18. What is the average salary of employees in Dev department?
select avg(salary) from emp where Department ='dev';

-- 19. Who are the employees with salaries above the average?

select name from emp where salary > avg(salary);
-- 20. Who are the employees with the lowest salary in Test department?
-- 21. How many employees were hired in 2023 year?
select count(name) from emp where 
-- 22. Who are the employees hired in the year 2023?
-- 23. What is the total salary expenditure in Dev and Support department?
-- 24. Who are the employees with a salary greater than the average salary of
-- Dev department?
SELECT Name, salary FROM emp WHERE salary > ( SELECT AVG(salary) FROM emp WHERE Department = 'dev');

-- 25. What is the total salary expenditure in Pune location?
SELECT SUM(salary)FROM emp WHERE Location = 'pune';

 