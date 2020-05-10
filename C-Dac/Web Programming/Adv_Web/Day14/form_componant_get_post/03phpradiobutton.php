<html>
  <head>
    <title>
      Reading data from radio buttons
    </title>
  </head>
  <body>
    <h1>
      Reading data from radio buttons
    </h1>
<h3> isset is check if value is set or not and return boolean It is not used with textbox</h3>
    You selected   
    <?php
      if (isset($_REQUEST["radios"])) {
        echo $_REQUEST["radios"];
      }
      else {
        echo "No radio button was selected. <br>";
      }
    ?>
  </body>
</html>
