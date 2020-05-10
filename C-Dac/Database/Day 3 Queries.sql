use mysqldb;
select count(*) from emp;


select count(distinct salary) from emp;

select sum(salary),avg(salary),149779/45 from emp;

select max(salary),min(salary)
from emp;

select max(ename),min(ename)
from emp;


select count(1) from emp;

select 
deptid ,sum(salary) from emp 
group by deptid;


select 
deptname ,sum(salary) from emp left join 
dept 
on
emp.deptid=dept.deptid
group by deptname
having sum(salary)>20000;

create table marks
(roll int, sub char(1),marks int, unique(roll,sub))

insert into marks values
(1,'m',95),(1,'e',97),(1,'h',98),
(2,'m',97),(2,'e',94),(2,'h',25),
(3,'m',35),(3,'e',36),(3,'h',37)

select * from marks


select roll,
case when avg(marks)>=40 and min(marks)>=35
then 'Pass'
else 'Fail' end
Result
from
marks
group by roll;


use mysqldb

create table t_auto 
(id int , name varchar(100), auto_increment(id))

select sum(case when deptname='HR' then salary
else 0 end) HR,
sum(case when deptname='IT' then salary
else 0 end) IT,
sum(case when deptname='Finance' then salary
else 0 end) Finance
from emp
join dept
on
emp.deptid=dept.deptid


create table emp_mgr
(eid int, ename varchar(100),mid int)

insert into emp_mgr values
(1,'a',4),(2,'b',4),(3,'c',4),(4,'d',4),
(5,'e',6),(6,'f',6),
(7,'g',8),(8,'h',8)

select * from emp_mgr

select e.mid,m.ename mname,e.eid,e.ename 
from emp_mgr e,emp_mgr m
where 
e.mid=m.eid
and
e.mid!=e.eid
order by e.mid


select e.mid,m.ename mname,e.eid,e.ename 
from emp_mgr e join emp_mgr m
on
e.mid=m.eid
where 
e.mid!=e.eid
order by e.mid


create table deptabc (id int primary key,dname varchar(50) )
create table empabc(id int, foreign key fk_abc (id) references deptabc(id))


select
a.ename,a.salary,d.deptname,
count(*)
from
emp a , emp b,dept d
where
a.deptid=b.deptid and
a.deptid=d.deptid and
a.salary<=b.salary
group by a.ename,a.salary,d.deptname
having count(*) <=5
order by d.deptname,a.salary desc

select salary ,nvl(salary,0) from
emp

select salary ,
case when salary is null then 0 
else salary end Sal_new
from
emp



select substr('abcdef' ,3,-2)

select left('test' ,-2)
,right('test',2)


select length(rtrim('abcef   '))



select ltrim('$$$ab$c$$','$')



select replace('$$ab$c','$','')


select instr('abcedf','[a-z]')



select floor(-10.2),ceiling(-10.2),
round(10.2365,2)

select abs(-10)

2016-11-23 12:12:47
select version(),
database(),
current_date()
,current_time(),
current_timestamp()


SELECT format('dd',CURRENT_DATE())


select year(cast('2016-1-01' as date))
,day(current_date),
month(current_date)
, hour(current_timestamp)
, minute(current_timestamp)
,second(current_timestamp)
,weekday(cast('2016-11-20' as date))

select ename,salary,
(select sum(i.salary)
from emp i where i.salary>=o.salary) running_total
from emp o
order by 2 desc

select ename,salary , case when next_sal is null then 0 
else next_sal end next_sal from
(select ename,salary,
(select max(i.salary)
from emp i where i.salary<o.salary) next_sal
from emp o
order by 2 desc)
t 

create temporary table
tmp1
(id int , name varchar(100))


INSERT INTo tmp1 values(1,'a')

select * from tmp1







