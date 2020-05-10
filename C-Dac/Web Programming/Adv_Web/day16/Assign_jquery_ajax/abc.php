<?php
$temp = $_REQUEST["name"];
$nm="VITA";
if($nm==$temp)
{
echo "Welcome".$nm;	
}
else
{
	//header("Location:LogIn.html");
	echo false;
}//echo "hello";
?>