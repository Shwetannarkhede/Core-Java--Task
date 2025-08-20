create database mappings;
use mappings;
create table teacher(tid int primary key, tname text);
create table subject(sid int primary key, sname text, tid int, foreign key(tid) references teacher(tid) on delete cascade on update cascade);

insert into teacher values(1, 'Abhijeet');
insert into teacher values(2, 'Gunjan');
insert into teacher values(3, 'Shubham');
select * from teacher;

insert into subject values(101, 'Java', 1);
insert into subject values(102, 'Python', 1);
insert into subject values(103, 'Testing', 2);
insert into subject values(104, 'DSA', 3);
select * from subject;

select sname from subject, teacher where tname = 'Abhijeet' AND teacher.tid = subject.tid;
