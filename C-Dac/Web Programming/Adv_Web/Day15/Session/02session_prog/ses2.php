<?PHP
 session_start();


foreach($_POST as $val)

$tot=$tot+$val;

$_SESSION['ST']=$tot;
?>



<html>
YOU HAVE SELECTED programing book worth

<?PHP
$sprog=$_SESSION['PROG'];
echo $sprog;
echo " story <br/>";

$sst=$_SESSION['ST'];
echo  "and story worth ".$sst;
?>

</html>