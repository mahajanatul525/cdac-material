<html>
  <head>
    <title>
      Modifying arrays
    </title>
  </head>
  <body>
    <h1>
      Modifying arrays
    </h1>
   <?php
      $actors[0] = "RAJ";
      $actors[1] = "GEETA";
      $actors[2] = "MONA";

      $actors[2] = "RAVINA";

      $actors[] = "JULY";

      echo "\$actors[0] = ". $actors[0]. "<br>";
      echo "\$actors[1] = ". $actors[1]. "<br>";
      echo "\$actors[2] = ". $actors[2]. "<br>";
      echo "\$actors[3] = ". $actors[3]. "<br>";
    ?>
  </body>
</html>
