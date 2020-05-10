<html>  <head>    <title>
      Handling scope in functions    </title>
  </head>  <body>    <h1>
      Handling scope in functions    </h1>
    <?php
      $value = 4;
      echo "In the calling code, \$value = ". $value. "<br>";
      scoper();
      echo "In the calling code again, \$value still = ". $value. "<br>";

      function scoper()
      {
        $value = 8000000;
        echo "In the function, \$value = ". $value. "<br>";
      }
    ?>
  </body>
</html>
