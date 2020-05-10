<html>
  <head>
    <title>
      Using default function arguments
    </title>
  </head>
  <body>
    <h1>
      Using default function arguments
    </h1>
    <?php
      echo "About to call the function...<br>";
      echo "Passing data to the function...<br>";
      display("The default argument is: ", " changed to Bye" );

      function display($greeting, $message = "Hello there!")
      {
         echo $greeting;
         echo $message;
      }
    ?>
  </body>
</html>