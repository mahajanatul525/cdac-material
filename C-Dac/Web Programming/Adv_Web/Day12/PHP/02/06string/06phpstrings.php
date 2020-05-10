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
echo "<hr/>";
      echo "The substring substr('No problem', 3, 7) is '", substr("No problem", 3, 7), "'<br>";    
echo "<hr/>";
      echo "The word 'problem' is at position ", strpos("No problem", "problem"), "<br>";
echo "<hr/>";
      echo "Replacing 'problem' with 'problems' gives: ", substr_replace("No problem", "problems", 3, 9), "<br>";
echo "<hr/>";
      echo "Using ASCII codes: ", chr(65), chr(66), chr(67), "<br>";
echo "<hr/>";
      echo "Uppercasing the first letter gives you: ", ucfirst("no problem"), "<br>";
echo "<hr/>";
      echo "In upper case: ", strtoupper("No problem"), "<br>";
echo "<hr/>";
      echo "In lower case: ", strtolower("No problem"), "<br>";
echo "<hr/>";
      echo "'&nbsp;&nbsp;&nbsp;&nbsp;No problem' trimmed is: '", trim("    No problem"), "'<br>";
echo "<hr/>";
      echo "Reversed: ", strrev("No problem"), "<br>";
echo "<hr/>";
      echo "There are ", substr_count("No problem", "o"), " o's in 'No problem'."; 	
echo "<hr/>";
    ?>
  </body>
</html>