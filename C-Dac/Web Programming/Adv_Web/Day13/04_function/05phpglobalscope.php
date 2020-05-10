<html>  <head>    <title>
      Handling local and global scope in functions
    </title>  </head>  <body>
    <h1>      Handling local and global scope in functions    </h1>
    <?php
      $value = 4;
     echo "In the calling code, \$value = ", $value, "<br>";
    
      global_scoper();
      echo "In the calling code again, \$value still = ", $value, "<br>";
      function global_scoper()
      {//observe global key word
        global $value;
        $value=60;
        echo "In the global scoper function, \$value = ", $value, "<br>";
      }
    ?>
  </body>
</html>
