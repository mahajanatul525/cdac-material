  <head>
    <title>
      Reading data from image maps
    </title>
  </head>
  <body>
    <h1>
      Reading data from image maps
    </h1>
<?php print_r($_REQUEST);?>
      You clicked the image map at location (
      <?php
        echo $_REQUEST["imap_x"], ", ", $_REQUEST["imap_y"];
      ?>
      ).
  </body>
</html>
