delimiter $$

create function coprime1( i int,j int)

returns varchar(50)

begin

declare temp int;

set temp:=1;

myloop:loop

set temp:=i%j;

if(temp=0) 
then 
return concat("not a coprime number");

end if;

if(temp=1) then
return concat("it is coprime");

end if;

set i:=j;

set j:=temp;

end loop myloop;

end;
$$