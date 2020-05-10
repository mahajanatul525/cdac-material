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
    echo "The word 'problem' is at position ", strpos("No problem", "problem"), "<br>";
echo "<hr/>";
 echo "The word 'PProblem' is at position  no output", strpos("No problem", "PProblem"), "<br>";
echo "<hr/>";


 echo "The word 'Problem' is at position ", stripos("No problem", "Problem"), "<br>";
echo "<hr/>";
?>
<p>strpos  take 2 arguments 
1-string
2-string to search
return index 
it is case sensitive

stripos makes case insensitive
</p>