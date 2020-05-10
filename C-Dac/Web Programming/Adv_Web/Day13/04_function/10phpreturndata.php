<html>
  <head>
    <title>
      Returning values from functions
    </title>
  </head>
  <body>
    <h1>
      Returning values from functions
    </h1>
    <?php
      echo "Passing 'How' 'are' 'things?' to connector...<br>";
      echo "Getting this result: ", connector("How", "are", "things?");

      function connector() 
      {
        $data = "";
        $arguments = func_get_args();
            
        for ($loop_index = 0; $loop_index < func_num_args(); $loop_index++)
 {
          $data .= $arguments[$loop_index] . " ";
        }
        return $data;
      } 
    ?>
  </body>
</html>
