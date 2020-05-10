<html>
  <head>
    <title>
      Passing variable arguments to functions
    </title>
  </head>
  <body>
    <h1>
      Passing variable arguments to functions
observe no parameter in function defination
    </h1>
<h3> func_get_args() is used it return all arguments in an array
func_num_args()-return number of arguments passed</h3>

    <?php
      echo "Passing 'How' 'are' 'things?' to connector...<br>";
      echo "Getting this result: ";
      connector("How", "are", "things?");
	  
      function connector() 
      { $data = "";
        $arguments = func_get_args();
         
for ($loop = 0; $loop < func_num_args(); $loop++) 
	{
          $data .=$arguments[$loop];
        }
        echo $data;
      } 
    ?>
  </body>
</html>
