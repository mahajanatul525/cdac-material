<html>
  <head>
    <title>
      Passing arrays to functions
    </title>
  </head>
  <body>
    <h1>
      Passing arrays to functions
    </h1>
    <?php
      $scores = array(65, 32, 78, 98, 66);

      averager($scores);

      function averager($array)
      {
        $total = 0;
        foreach ($array as $value) {
           $total += $value;
        }

        if(count($array) > 0){
         echo "The average was ", $total/count($array);
        } else {
         echo "No elements to average!";
        }
      }
    ?>
  </body>
</html>
