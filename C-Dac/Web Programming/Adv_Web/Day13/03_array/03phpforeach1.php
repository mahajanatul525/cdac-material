<html>
  <head>
    <title>
      Using a foreach loop to loop over an array
    </title>
  </head>
  <body>
    <h1>
      Using a foreach loop to loop over an array
    </h1>
   <?php
      $arr[0] = "RAJ";
      $arr[1] = "Mona";
      $arr[2] = "Geeta";

      foreach ($arr as $value) {
        echo "Value: $value <br>";
      }    ?>
  </body>
</html>