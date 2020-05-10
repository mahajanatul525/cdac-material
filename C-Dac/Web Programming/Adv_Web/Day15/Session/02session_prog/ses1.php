<?PHP

 session_start();


foreach($_POST as $val)
{ 

echo   $val."<br/>" ;

  $tot= $tot+$val;

}
echo $tot;
$_SESSION['PROG']=$tot;

?>



<html>
YOU HAVE SELECTED programming book worth 
<?PHP
$sprog=$_SESSION['PROG'];
echo $sprog;
?>

SELECT STORY

<form method="post" action="ses2.php">

<input type="checkbox" name="st1" value=50>Thirsty crow:50
<input type="checkbox" name="st2" value=150>Ackbar birbal:150
<input type="checkbox" name="st3" value=250>Tenali raman:250
<input type="submit">
</form>
</body>
</html>