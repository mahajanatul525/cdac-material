<html>
    <head>
        <title>
            Using variable variables
        </title>
    </head>
    <body>
        <h1>
            Using variable variables
        </h1>
        <?php
         $a = 1;
         $b = "a";
         echo "Number of cheeseburgers: ". $a . "<br>";
         echo "That number with variable's vriable concatination again: ". $$b. "<br>";
		 echo "That number in double quotes again:  $$b <br>";
        echo "Once again: ${$b} <br>";
        ?>
    </body>
</html>