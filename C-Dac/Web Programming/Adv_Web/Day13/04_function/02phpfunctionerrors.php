<html>
  <head>
    <title>
      Handling errors from functions
    </title>
  </head>
  <body>
    <h1>
      Handling errors from functions die will exit the application
    </h1>
    <?php
      echo "The reciprocal of 2 is: ";
      reciprocal(2) or die ("Cannot take the reciprocal of zero.");
      echo "The reciprocal of 0 is: ";
      reciprocal(0) or die ("Cannot take the reciprocal of zero.");
echo "I will not be printed";

      function reciprocal($value)
      {
        if ($value != 0) {
          echo 1 / $value, "<br>";
          return TRUE;
        }
        else {
          return FALSE;
        }
      }
    ?>
  </body>
</html>
