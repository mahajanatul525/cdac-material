create function dist_func(inch int)
returns int
begin
declare yard int;
set yard:=inch%36;

return yard;
end