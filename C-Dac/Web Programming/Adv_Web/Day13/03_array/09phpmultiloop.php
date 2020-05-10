<html>  <head>    <title>
      Looping over multidimensional arrays
    </title>  </head>
  <body>    <h1>
      Looping over multidimensional arrays
/*count($scores[$outer]) count  $scores is array	1st time outer is 0	*/
    </h1>
    <?php
      $scores[0][] = 79;
      $scores[0][] = 74;
     $scores[0][] = 76;
      $scores[1][] = 69;
      $scores[1][] = 84;
echo count($scores); //2
echo "<hr>";
      for ($outer = 0; $outer < count($scores); $outer++)
    {     for($inner = 0; $inner < count($scores[$outer]); $inner++)
	  {  echo "\$scores[$outer][$inner] = ", 
            $scores[$outer][$inner], "<br>";
        }
      }
echo "<hr/>";
echo count($scores[0]);
    ?>
  </body>
</html>






