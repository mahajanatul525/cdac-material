<html>
  <head>
    <title>
      Displaying text from PHP
    </title>
  </head>

  <body>
    <h1>
      Displaying text from PHP
    </h1>
    Here's what PHP has to say:
   <br>
   <br>
    <?php
$a=55;
echo <<<END
This example uses<br/" 
<strong>"here document"</strong> syntax to display all 
the text until the ending token is reached.
<form>
<input name="nm" value="$a"/>
</form>
END;
    ?>
  </body>
</html>
