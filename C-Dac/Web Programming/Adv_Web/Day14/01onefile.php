<?PHP
if($_POST['user'])
{
print "hello, ";
print $_POST['user'];
var_dump($_SERVER[PHP_SELF]);
}

print <<<_HTML_
<form METHOD="POST" ACTION="01onefile.php">
name:<input name="user"/>
<input type="submit"/>
</form>
_HTML_;

?>