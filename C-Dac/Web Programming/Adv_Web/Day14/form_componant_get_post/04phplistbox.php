  <head>
    <title>
      Reading data from list boxes
    </title>
  </head>
  <body>
    <h1>
      Reading data from list boxes
    </h1>
    Your ice cream flavors:
    <BR>
    <?php
      foreach($_REQUEST["ice_cream"] as $flavor){
        echo $flavor, "<br>";
            }
			print_r($_REQUEST);
    ?>
  </body>
</html>
