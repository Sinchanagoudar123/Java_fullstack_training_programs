create database student;
create table university(Regnum int,Name varchar(25),Mark1 int,Mark2 int,primary key(Regnum));
select * from university;
insert into university values(101,'Jagadish',70,70);
insert into university values(102,'Kushal',70,70);
insert into university values(103,'Neha',70,70);
update university set Name='Neha S' where Regnum=103;
