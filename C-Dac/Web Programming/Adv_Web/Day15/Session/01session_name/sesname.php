<?PHP
session_start();
$_SESSION['NM']=$_GET["nm"];

echo session_id() ."<br/>";
echo session_name();
?>


<html>
if u are valid user u will see the next page
<form action="sesname1.php">

<input type="submit">

</form>
<?php

print_r($_SESSION);

?>

</html>