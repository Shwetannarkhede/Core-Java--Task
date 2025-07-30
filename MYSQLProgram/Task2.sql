create database Capgeminii;
USE Capgemini;
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


