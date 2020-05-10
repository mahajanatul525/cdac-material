<?PHP
$val=$_POST["nm"];
setcookie("USER",$val,time()+3600);

echo "<a href='01cook1.php'>click</a>";

?>