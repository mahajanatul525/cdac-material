<?PHP
session_start();
$SS=$_SESSION['NM'];



if($SS == "ket")
{
echo  "welcome".$SS; 
echo session_id() ."<br/>";
echo session_name();
}
else
{
header("Location:http://localhost:/2016/session/01session_name/sesname.html");

}
?>


