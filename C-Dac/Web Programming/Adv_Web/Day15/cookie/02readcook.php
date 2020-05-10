<HTML>
<HEAD>
<META NAME="GENERATOR" Content="Microsoft Visual Studio 6.0">
<TITLE></TITLE>
</HEAD>
<BODY>
<form action="02createcook.php" method="GET">

<P>
name<INPUT type="text" name="nm" value=<?PHP echo $_COOKIE["u1"];?>></P>
<P>Password 
<INPUT type="text" name=t2></P>

<P><INPUT type="checkbox" name="chk1" value="Remember"></P>
<P><INPUT type="submit" value="Click" name="submit"></P>
<?PHP echo $_COOKIE["u1"];?>
</form>
</BODY>
</HTML>
