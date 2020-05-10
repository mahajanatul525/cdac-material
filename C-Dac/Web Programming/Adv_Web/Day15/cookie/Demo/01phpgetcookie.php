<html>
  <head>
    <title>
      Reading a cookie
    </title>
  </head>

  <body>
    <h1>
      Reading a cookie
    </h1>
      The cookie says: 
      <?php
        if (isset($_COOKIE['message'])) {
          echo $_COOKIE['message'];
        }
      ?>
  <body>
</html>
