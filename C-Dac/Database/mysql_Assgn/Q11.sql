create function F2C(fahrenheit int)
returns int
begin
declare celsius int;
set celsius:=(fahrenheit-32)*(5/9);
return celsius;
end;
$$