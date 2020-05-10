<html>
  <head>
    <title>
      Using a foreach loop with keys and values in an array
    </title>
  </head>
  <body>
    <h1>
      Using a foreach loop with keys and values in an array
    </h1>
   <?php
     $debts["Jill"] = 2493.77;
     $debts["Bob"] = 4930.33;
     $debts["Sam"] = 5493.22;

      foreach ($debts as $key => $value) {
        echo "Key:". $key . "Value:". $value ."<br/>";
      }
    ?>
  </body>
</html>
