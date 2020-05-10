use jd;
#factorial
 delimiter $$
 create function fact(num int)
 returns int
 begin
 declare i int;
 declare j int;
 set i:=1;
 set j:=num;
 myloop:loop
 if(j<1) then
 leave myloop;
 end if; 
 set i:=i*j;
 set j:=j-1;
end loop myloop;
return i;
 end
 $$
 drop function fact;
  select fact(5);
  
  #string rev
  drop function strrev;
  delimiter $$
  create function strrev(s varchar(10))
  returns varchar(20)
  begin
  declare word varchar(20); 
  declare l int;
  declare c int;
  declare rev varchar(20); 
  set word:=s;
  set l:=length(word);
  set c:=1;
  set rev:='';
  myloop:loop
  if(c>l) then 
  leave myloop;
  end if;
  set rev:=concat(rev,substring(word,l+1-c,1));
  set c:=c+1;
  end loop myloop;
  return rev;
  end
  $$
select strrev('akhilesh');

#fibo
drop procedure fibo;
delimiter $$
create procedure fibo(in num int ,out f int)
begin
declare f1 int;
declare f2 int;
declare f3 int;
declare i int;
set i:=0;
set f1:=0;
set f2:=1;
myloop:loop
if(i>=num) then
leave myloop;
end if;
set f3:=f1+f2;
select f3;
set f:=f3;
set f1:=f2;
set f2:=f3;
set i:=i+1;
end loop myloop;
end
$$
call fibo(5,@v);
select @v;

#prime
drop procedure prime;
delimiter $$
create procedure prime(num int, out ans char(20))
begin 
declare p int;
declare i int;
set p:=num;
set i:=2;
myloop:loop
if(i>num/2)=0 then 
leave myloop;
end if;
if(num%i)=0 then
leave myloop;
end if;
set ans:='not prime';
set i:=i+1;

end loop myloop;
end
$$
call prime(7,@v);
select @v;

#co prime
drop function coprime;
delimiter $$
create function coprime
(num1 int,num2 int)
returns varchar(100)
begin
declare ln int;
declare i int;
declare sn int;
set i:=2;
if(num1>num2) then
set sn:=num2;
else 
set sn:=num1;
end if;
myloop:loop
if(i>sn)
then
leave myloop;
else
if(num1%i)=0 and (num2%i)=0 then
return 'not coprime';
end if;
set i:=i+1;
end if;
end loop myloop;
return 'coprime';
end
$$

select coprime(3,1);





