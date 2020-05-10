<html>
    <head>
        <title>
            Using variable interpolation with adjoining words
        </title>
    </head>
    <body>
        <h1>
            Using variable interpolation with adjoining words
        </h1>
        <?php
            $type = "basket";
            echo "The name of the game is {$type}ball.<br>";
  echo "The name of the game is $type ball.<br>";
        ?>

<hr/>
<?php
            $type = "basket";
  echo 'The name of the game is {$type}ball.<br>';
 echo 'The name of the game is $type ball.<br>';
        ?>
    </body>
</html>
