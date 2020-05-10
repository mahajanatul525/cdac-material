<html>
  <head>
    <title>
      Using the foreach loop
    </title>
  </head>

  <body>
    <h1>Using the foreach loop</h1>
      <?php
        $arr = array("turkey", "ham", "beef");

        foreach ($arr as $value) {
          echo "Current sandwich: $value<br>";
        }
      ?>  
  </body>
</html>
