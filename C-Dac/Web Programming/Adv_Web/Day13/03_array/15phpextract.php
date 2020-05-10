<html>
  <head>
    <title>
      Extracting variables from arrays
    </title>
  </head>

  <body>
    <h1>Extracting variables from arrays</h1>
<h3>you can use extract to create variables whoes names will be taken from the keys in the array and those variables will be assigned the values in the array. </h3>
    <?php
      $ice_cream["good"] = "orange";
      $ice_cream["better"] = "vanilla";
      $ice_cream["best"] = "rum raisin";

      extract($ice_cream);

      echo "\$good = $good<BR>";
      echo "\$better = $better<BR>";
      echo "\$best = $best<BR>";
print_r($ice_cream);
    ?>
  </body>
</html>
