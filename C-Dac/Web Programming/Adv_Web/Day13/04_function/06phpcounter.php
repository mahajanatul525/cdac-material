<html>
  <head>
    <title>
      Keeping a count of function calls
    </title>
  </head>
  <body>
    <h1>
      Keeping a count of function calls
    </h1>
    <?php
      echo "Now the count is: ", count_function(), "<br>";
      echo "Now the count is: ", count_function(), "<br>";
      echo "Now the count is: ", count_function(), "<br>";
      echo "Now the count is: ", count_function(), "<br>";
      echo "Now the count is: ", count_function(), "<br>";

      function count_function()
      {
//static initialised only once-persist value
        static $counter;
        $counter++;
        return $counter;
      }

    ?>
  </body>
</html>
