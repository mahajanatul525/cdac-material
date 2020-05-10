create function fact1(num int)
returns int
begin
declare fact int;
set fact:=1;
myloop:loop
if(num<1) then 
return fact;
end if;
set fact:=fact*num;
set num:=num-1;
end loop myloop;
end;
$$