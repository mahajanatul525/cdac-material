<html>
        <head>
            <title>
                Navigating through arrays
            </title>
        </head>

        <body>
            <h1>
                Navigating through arrays
            </h1>
<h3>navigation is done with an array pointer, which keeps track of your location in the array.</h3>
        <?php

            $ice_cream[0] = "chocolate";
            $ice_cream[1] = "pecan";
            $ice_cream[2] = "strawberry";

            echo "Current element: ", current($ice_cream), "<br>";

            echo "Next element: ", next($ice_cream), "<br>";

            echo "Previous element: ", prev($ice_cream), "<br>";

            echo "End element: ", end($ice_cream), "<br>";
			  echo "End element: ", next($ice_cream), "<br>";
   


            echo "Resetting the array...<br>";
            reset($ice_cream);
         echo "Current element: ", current($ice_cream), "<br>";
	 

        ?>
    </body>
</html>
