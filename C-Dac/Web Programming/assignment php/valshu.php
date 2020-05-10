<html><body">
my name is<?php echo $_REQUEST["nm1"]; ?>.<br />
my id is<?php echo $_REQUEST["nm2"]; ?>bc.<br/>
password<?php echo $_REQUEST["nm3"]; ?>###<br/> 

<?PHP
echo "<br/>";
foreach($_REQUEST as $val)
{echo $val; }
echo "<br/>";
print_r($_REQUEST);

?>
</body>
</html>
