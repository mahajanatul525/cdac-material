<html>  <head>    <title>      Merging arrays
    </title>  </head>
  <body>
    <h1>      Merging arrays    </h1>
    <?php
      $pudding = array("vanilla", "rum raisin", "orange");
      $ice_cream = array("chocolate", "pecan", "strawberry");

      $desserts = array_merge($pudding, $ice_cream);

      foreach ($desserts as $value) {
        echo "$value <br>";
      }
print_r($desserts);
print_r($pudding);
print_r($ice_cream);
echo "<hr/>";

 $p = array("k1"=>"vanilla", "rum raisin", "orange");
 
      $i = array("k1"=>"chocolate", "pecan", "strawberry");

      $d = array_merge($p, $i);

      foreach ($d as $value) {
        echo "$value <br>";
      }

    ?>
  </body>
</html>