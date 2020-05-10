<html>
  <head>
    <title>
      Deleting an array element
    </title>
  </head>
  <body>
    <h1>
      Deleting an array element
    </h1>
   <?php
      $actors[0] = "Cary Grant";
      $actors[1] = "Myrna Loy";
      $actors[2] = "Lorne Green";

      unset($actors[0]);
	unset($actors[1]);
	unset($actors[2]);
print_r($actors);
echo "<hr/>";
 $actors[]="vita";
print_r($actors);
echo "<hr/>";

echo "<hr/>";
//re-index
 $arr=array_values($actors);
print_r($arr);
echo "<hr/>";
    ?>
  </body>
</html>
