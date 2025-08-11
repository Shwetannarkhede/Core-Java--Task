use Capgeminii;
select * from employees; 
SELECT * FROM employees WHERE NOT name  = 'yash';
SELECT  EXISTS ( SELECT name FROM employees WHERE name ='Rani') ;
DROP TABLE IF EXISTS employ;

select * from employees where name in ('Ramesh', 'Rani', 'Pankaja');
select * from employees where name not in ('Ramesh', 'Rani', 'Pankaja');

select * from employees where age between 30 AND 35;
select * from employees where age not between 30 AND 35;
select * from employees limit 10;
select * from employees limit 2 offset 2;

SELECT name FROM  employees WHERE EXISTS (SELECT *  FROM employees WHERE name ='rani');
use infosys;
SELECT Department, AVG(salary) FROM emp GROUP BY Department HAVING AVG(salary) > 20000;


