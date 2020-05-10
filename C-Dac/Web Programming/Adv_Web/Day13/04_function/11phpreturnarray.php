<html>
  <head>
    <title>
      Returning arrays from functions
    </title>
  </head>
  <body>
    <h1>
      Returning arrays from functions
    </h1>
<h3>it create array of the length you speify </h3>
    <?php
      $data = create_array(3);
      echo "Here's the first array:<br>";
      print_r($data);
      echo "<br>";

      $data_2 = create_array(4);
      echo "Here's the second array:<br>";
      print_r($data_2);

      function create_array($number) 
      {
        for ($loop_counter = 0; $loop_counter < $number; $loop_counter++){
          $array[] = $loop_counter;
        }

        return $array;
      } 
    ?>
  </body>
</html>
