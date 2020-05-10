drop table t1

create table t1 ( c1 int , c2 int, c3 varchar(100), unique (c1,c2))


insert into t1 (c1,c2) values(1,'a')


insert into t1 (c1,c2) values(2,'b')


drop table t1_pk

create table t1_pk (c1 int,c2 int,c3 varchar(100), primary key(c1,c2))


create table t1_pk (c1 int primary key,c2 int primary key,c3 varchar(100))


create table t1_uk (c1 int unique,c2 int unique,c3 varchar(100))
drop table t1_upk

create table 
t1_upk (c1 int not null unique,c2 int primary key,c3 varchar(100),salary int
check(salary>0));


create table dept (deptid int primary key,deptname varchar(100))

drop table emp

create table emp (eid int, ename varchar(100),salary int,deptid int 
references dept(deptid))


create table emp (eid int, ename varchar(100),salary int,deptid int ,
foreign key  fk1_emp (deptid) references  dept(deptid))

truncate table emp;

alter table emp add primary key (eid);




drop table emp;
drop table dept;


drop table dept
  create table dept ( deptid int primary key , deptname varchar(10))


  create table emp ( eid int  , ename varchar(20) , salary int , deptid int references dept(deptid))



  insert into dept values (1 , 'HR')
  insert into dept values (2, 'IT')
  insert into dept values (3, 'Finance') 

select * from dept


   insert into emp values (1,'a',1000,1)
   insert into emp values (2,'b' , 1023 , 2)
   insert into emp values (3,'c' , 23 , 3)
   insert into emp values (4,'d' , 123 , 3)
   insert into emp values (5,'e' , 102 , 1)
   insert into emp values (6,'f' , 2023 , 3)
   insert into emp values (7,'g' , 323 , 1)
   insert into emp values (8,'h' , 523 , 2)
   insert into emp values (9,'i' , 136 , 1)
   insert into emp values (10,'j', 627 , 1)
   insert into emp values (11,'k' , 978 , 3)
   insert into emp values (12,'l' , 222 , 1)
   insert into emp values (13,'m' , 746 , 1)
   insert into emp values (14,'n' , 3223 , 1)
   insert into emp values (15,'o' , 1999 , 3)
   insert into emp values (16,'p' , 821 , 3)
   insert into emp values (17,'q' , 324 , 1)
   insert into emp values (18,'r' , 546 , 3)
   insert into emp values (19,'s' , 717 , 2)
   insert into emp values (20,'t' , 817 , 2)
   insert into emp values (21,'u' , 888 , 3)
   insert into emp values (22,'v' , 9029 , 1)
   insert into emp values (23,'w' , 20001 , 3)
   insert into emp values (24,'x' , 28222 , 1)
   insert into emp values (25,'y' , 19212 , 3)
   insert into emp values (26,'z' , 12111 , 1)
   insert into emp values (27,'a1' , 3211 , 1)
   insert into emp values (28,'a2' , 9238 , 1)
   insert into emp values (29,'a3' , 653 , 3)
   insert into emp values (30,'a4' , 44 , 1)
   insert into emp values (31,'a5' , 3 , 2)
   insert into emp values (32,'a6' , 16 , 1)
   insert into emp values (33,'a7' , 14 , 2)
   insert into emp values (34,'a8' , 845 , 1)
   insert into emp values (35,'a9' , 135 , 3)
   insert into emp values (36,'b1' , 1212 , 1)
   insert into emp values (37,'b2' , 1242 , 2)
   insert into emp values (38,'b3' , 4212 , 2)
   insert into emp values (39,'b4' , 4444 , 3)
   insert into emp values (40,'b5' , 555 , 1)
   insert into emp values (41,'b6' , 1553 , 3)
   insert into emp values (42,'b7' , 6432 , 1)
   insert into emp values (43,'b8' , 4532 , 2)
   insert into emp values (44,'b9' , 3355 , 1)
   insert into emp values (45,'c1' , 2324 , 2)



select * from emp where eid=1 or eid=2 or eid=3

select * from emp where eid  in (1,2,3)
select * from emp where eid not in (1,2,3)

select * from emp  where ename like 'b_'

insert into emp (eid,ename) values(47,'a%b_c');

insert into emp (eid,ename) values(48,'a%bc');

insert into emp (eid,ename) values(49,'a_b_c');


select * from emp where ename like '%\%%'



select ename,deptname,d.deptid did from emp cross join dept d

drop table t1

create table t1 ( c1 int, c2 varchar(100));

create table t2 ( c1 int, c3 varchar(100));

insert into t1 values(1,'a'),(3,'b'),(5,'c');

insert into t2 values(1,'x'),(4,'y'),(6,'z');

#cross join
select * from t1 cross join t2;
select * from t1 , t2;

#inner join

select * from t1 join t2
 on t1.c1=t2.c1;
 
 
select * from t1  inner join t2
 on t1.c1=t2.c1;



 
select * from t1  , t2
 where  t1.c1=t2.c1;
 
 ## non equie
 
 
 
select * from t1  , t2
 where  t1.c1>t2.c1;

# left join

select * from t1 left join t2
 on t1.c1=t2.c1;
 
# right join

select * from t1 right join t2
 on t1.c1=t2.c1;

# full join

select * from t1  left join t2
 on t1.c1=t2.c1
 union 
 select * from t1  right join t2
 on t1.c1=t2.c1
 ;
 
 
 create table a ( i int);
 
 create table b ( i int);

insert into a values(1),(2),(3);

insert into b values(3),(4),(5); 
select * from a union select * from b;
select * from b union select * from a;

select * from a union all select * from b;
select * from b union all select * from a;

select * from a intersect select * from b;
select * from b intersect select * from a;

select * from a except  select * from b;
select * from b union select * from a;



select ename,deptname,salary,
 case when salary <=500 then 'low'
when salary > 500 and salary <=1000 then 'Med'
else 'high'
end Sal_Band
from
emp left join dept
on 
emp.deptid=dept.deptid;




select * from emp order by salary desc limit 10;



 





select 




