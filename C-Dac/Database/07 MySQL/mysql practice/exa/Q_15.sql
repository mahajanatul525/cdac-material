Create a table EMPLOYEE with the following columns:- (10 marks)
Employee No. Varchar2 4
Employee Name Varchar2 30
Designation Varchar2 10
Category Character 1
Basic Salary Number 4
Category may be ‘J’, ‘S’, or ‘W’ for Jr. Officers, Sr. officers or Worker category.
Formulae:-
DA = 35% of Basic Salary correct up to paise.
HRA = 15% of Basic Salary subject to a maximum of Rs. 250/1000/30000 for categories W/J/S respectively.
Gross = Basic Salary +DA +HRA
Output the Employee Number and the Gross for each employee in a separate table.





create table Employee(Eno varchar(4) primary key, Empname varchar(30), Designation varchar(10),Category char(1),Salary int);
insert into Employee(Eno,Empname,Designation,Salary,Category) values('1','A','Junior',14000,'J'),('2','B','Senior',44000,'S'),('3','C','Junior',15000,'J'),('4','D','Worker',600,'W'),('5','E','Junior',18000,'J'),('6','F','Senior',145600,'S'),('7','G','Junior',16533,'J'),('8','H','Worker',1400,'W');


select Eno,Empname,(salary+HRA+DA) Gross from
(select e.Eno Eno,e.Empname Empname, e.Salary salary, case
when e.category='J' and ((15/100)*e.Salary)>=1000 then 1000
when e.category='W' and ((15/100)*e.Salary)>=250 then 250
when e.category='S' and ((15/100)*e.Salary)>=30000 then 30000 else (15/100)*e.Salary
end HRA,(35/100)*e.Salary DA
from Employee e) as Emp

