<html>
  <head>
    <title>
      Reading data from text areas
    </title>
  </head>
  <body>
    <h1>
      Reading data from text areas
    </h1>
    You ordered a pizza with: <br>  
    <?php
      $text = $_REQUEST["data"];
	  echo  $text; 
      echo str_replace("\n", "<br/>", $text);
    ?>
  </body>
</html>







