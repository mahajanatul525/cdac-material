<html>
  <head>
    <title>
      Using string functions
    </title>
  </head>
  <body>
    <h1>
      Using string functions
    </h1>
    <?php
      echo "The test string is 'No problem'.<br>";
echo "<hr/>";
      echo "'No problem' is ", strlen("No problem"), " characters long<br>";
echo("<hr/>");	 
 
$a="apple";
echo $a;
echo("<hr/>");	 
	  echo md5($a);
echo "<hr/>";

?>
md5  Calculate the md5 hash of a string

Returns the hash as a 32-character hexadecimal number. 
</html>