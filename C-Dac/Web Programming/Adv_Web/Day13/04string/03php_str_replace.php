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
     echo "Replacing 'problem' with 'ERR' gives 5 character: ", substr_replace("No problem", "ERR", 3, 5), "<br>";
echo "<hr/>";
?>
<p>replace take 4 arguments 
1-string
2-string to replace 
3. start index
3-no of character to replace
</p>