<html>
  <head>
    <title>
      Using a for loop to loop over an array
    </title>
  </head>
  <body>
    <h1>
      Using a for loop to loop over an array
    </h1>
   <?php
      $arr[0] = "RAJ";
      $arr[1] = "GEETA";
      $arr[2] = "Mona";

      for ($i = 0; $i < count($arr); $i++)
{
        echo "\$arr[$i] = ". $arr[$i]. "<br>"; 
      }
	  echo $arr;
    ?>
  </body>
</html>
