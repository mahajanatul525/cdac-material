<html>  <head>    <title>
      Deleting an array element
    </title>  </head>
  <body>    <h1>
      Deleting an array element    </h1>
   <?php
      $actors[0] = "Cary Grant";
      $actors[1] = "Myrna Loy";
      $actors[2] = "Lorne Green";

      unset($actors[0]);
 unset($actors[1]);
  unset($actors[2]);
  print_r($actors);
  
      /*echo "\$actors[0] = ", $actors[0], "<br>";
      echo "\$actors[1] = ", $actors[1], "<br>";
      echo "\$actors[2] = ", $actors[2], "<br>";*/
echo "<hr/>";
/*$actors[] = "chk this out";
print_r($actors);

echo "<hr/>";
//re-index
 $arr=array_values($actors);
print_r($arr);
echo "<hr/>";
unset($acrors);
print_r($acrors);*/

    ?>
  </body>
</html>
