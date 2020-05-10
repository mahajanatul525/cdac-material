CREATE DEFINER=`root`@`localhost` FUNCTION `palindrome`(word varchar(100))  
RETURNS varchar(100) CHARSET latin1

BEGIN

declare str varchar(100);

declare i int;

declare l int;

set str:='';

set l:=length(word);

set i:=1;


myloop:loop
	
if(i>l) then
	
leave myloop;
  
  end if;
    
   
 set str:=concat(str,substr(word,l+1-i,1));
   
 set i:=i+1;

end loop myloop; 

if (word=str)
then 

RETURN('palindrome');

end if;

return('not palindrome');

END