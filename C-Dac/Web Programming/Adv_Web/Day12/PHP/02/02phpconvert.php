<html>
  <head>
    <title>
      Converting from strings and numbers
    </title>
  </head>
  <body>
    <h1>
      Converting from strings and numbers
    </h1>
    <?php
    $float = 3.1415;
    

	$a=(string) $float;
	
	echo gettype($a);
	var_dump($a);
	echo "<hr/>";

  
	$fsr=strval($a);
	var_dump($fsr);
    $value = 1 + "19.2";
    echo "$value <br>";      
var_dump($value);	
           
    $text = "3.0";
    $value = (float) $text;
    echo $value / 2.0, "<br>";
?>
<p>strval — Get string value of a variable</p>
  </body>
</html>