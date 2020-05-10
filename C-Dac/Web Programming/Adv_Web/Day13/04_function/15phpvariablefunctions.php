<html>
  <head>
    <title>
      Creating variable functions
    </title>
  </head>
  <body>
    <h1>
      Creating variable functions
    </h1>
<h3> recall that in php variable variables you only had to load the name of a variable into another variable to be able to access the first variable.
well, you can do the same thing with functions in php</h3>
    <?php
      $function_variable = "red";
      $function_variable();        

      $function_variable = "white";
      $function_variable("In white() now.");  
   

      function red() 
      {        echo "In red() now.<br>";
      }

      function white($argument)
      {        echo "$argument <br>";
      }
      
    ?>
  </body>
</html>
