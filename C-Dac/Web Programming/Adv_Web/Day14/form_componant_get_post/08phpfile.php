<html>
  <head>
        <title>Reading file data</title>
  </head>
  <body>
    <h1>Reading file data</h1>
    <br>
    The file contained:
    <br>
    <?php

      $handle = fopen($_FILES['userfile']['tmp_name'], "r");
      while (!feof($handle)){
        $text = fgets($handle);
        echo $text, "<br>";
      }

      fclose($handle);
print_r($_FILES);
    ?>
<p>Returns TRUE if the file pointer is at EOF otherwise returns FALSE. 

</p>
<p>Returns a string of up to length - 1 bytes read from the file pointed to by handle . 

If an error occurs, returns FALSE. 

</p>
  </body>
</html>