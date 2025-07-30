-- create database Capgemini;
USE Capgemini;

-- CREATE TABLE employee (
--   id INT PRIMARY KEY AUTO_INCREMENT,
--   name VARCHAR(100),
--  profile VARCHAR(100),
--   email VARCHAR(100),
--   salary INT,
--   age INT,
--   experience INT
-- );

-- INSERT INTO employee (id,name,profile,email,salary,age,experience)
-- VALUES('1','Rani','dev','rani@gmail.com','11000','43','27'),
-- ('2','raj','test','raj@gmail.com','21000','33','17'),
-- ('3','radha','test','radha@gmail.com','26000','38','21'),
-- ('4','raj','dev','raj12@gmail.com','51000','32','12'),
-- ('5','jhone','dev','jhone@gmail.com','51000','39','27');

-- Q1. As a user I want only those employee names who has salary more than 20K.
-- SELECT name FROM employee WHERE salary > 20000;

-- Q2. As a user I want all the employee information who has salary 51K.
-- SELECT name FROM employee WHERE salary = 51000;

-- Q 3. As a user I want only name and experience who has age more that 35.
-- SELECT name , experience  FROM employee WHERE age >35;

-- Q4. As a user, I want only those employees who belong to dev profile.
SELECT * FROM employee WHERE profile = 'dev';

-- Q5. As a user, I want those employee names who have profile test.
SELECT name FROM employee WHERE profile = 'test';

-- Q6. As a user I want record of employee who has salary 25K and more than 25K.
SELECT * FROM employee WHERE salary >= 25000;

-- Q7. As a user I want to get those employee names and emails who are not having salary 51K.
SELECT name, email FROM employee WHERE salary != 51000;

-- Q8. As a user I want to update the employee salary by 10K who is having experience less than 20 years.
set SQL_SAFE_UPDATES =0;
 UPDATE employee SET salary = salary + 10000 WHERE experience < 20;

-- Q9. As a user I want to remove employee record who is having 21 years of experience as he/she left the job.
delete from employee where experience = 21;

-- Q10. As a user I want to decrease the salary of John by 21K as company wants to perform cost cutting.
UPDATE employee SET salary = salary - 21000 WHERE name = 'john';

