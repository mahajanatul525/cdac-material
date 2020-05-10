<?PHP
$rem=$_REQUEST["chk1"];
	if($rem == "Remember") 
{		$val=$_REQUEST["nm"];
		setcookie("u1",$val,time()+3600);
		//echo $_COOKIE["u1"];
		
}
	else
		{
		echo "Cookies Not Created";}
print_r($_COOKIE);
print_r($_REQUEST);

	
?>

