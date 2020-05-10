<html>
  <head>
    <title>
      Passing data to functions
    </title>
  </head>
  <body>
    <h1>
      Passing data to functions
    </h1>
    <?php
      echo "About to call the function...<br>";
      echo "Passing data to the function...<br>";
      display("Hello", " there!");

      function display($greeting, $message)
      {
         echo $greeting;
         echo $message;
      }
    ?>
  </body>
</html>
