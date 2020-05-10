<html>  <head>    <title>
      Flipping keys and values in arrays
    </title>  </head>
  <body>    <h1>
      Flipping keys and values in arrays
    </h1>
    <?php
      $ice_cream = array("flavor_1" => "vanilla", "flavor_2" => "rum raisin", 
        "flavor_3" => "orange");

      foreach ($ice_cream as $key => $value) {
        echo "Key: $key; Value: $value<br>";
      }
      echo "<br>";

      $ice_flip = array_flip($ice_cream);

      foreach ($ice_flip as $key => $value) {
        echo "Key: $key; Value: $value<br>";
      }
echo "<hr/>";
print_r($ice_cream);
    ?>
  </body>
</html>
