<html>
  <head>
    <title>
      Passing data to functions by reference
    </title>
  </head>
  <body>
    <h1>
      Passing data to functions by reference
    </h1>
<h3> </h3>
    <?php
      $value = 4;
      echo "Before the call, \$value holds $value <br>";
      squarer($value);
      echo "After the call, \$value holds $value <br>";

      function squarer(&$number)
      {
         $number *= $number;
      }
    ?>
  </body>
</html>
