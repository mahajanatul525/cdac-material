<html>
  <head>
    <title>
      Using the array function
    </title>
  </head>
  <body>
    <h1>
      Using the array function key value
    </h1>
    <?php
      $debts = array("Jill" => 2493.77, "Bob" => 4930.33, "Sam" => 5493.22);

      echo "\$debts['Jill'] = ". $debts["Jill"]. "<br/>";
      echo "\$debts['Bob'] = ". $debts["Bob"]. "<br/>";
      echo "\$debts['Sam'] = ". $debts["Sam"]. "<br/>";
print_r($debts);
    ?>
  </body>
</html>
