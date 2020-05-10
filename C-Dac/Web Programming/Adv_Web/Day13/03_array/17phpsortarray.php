<html>
<?php
    $ice_cream[0] = "2orange";
    $ice_cream[1] = "vanilla";
    $ice_cream[2] = "Rum raisin";
    $ice_cream[3] = "5";
	  $ice_cream[4] = "9";
    print_r($ice_cream);
    echo "<hr/>";
    sort($ice_cream);

    print_r($ice_cream);


echo "<hr/>";


    $ice_cream[0] = "orange";
    $ice_cream[1] = "vanilla";
    $ice_cream[2] = "Rum raisin";
rsort($ice_cream);
print_r($ice_cream);
?>
<p> it will modify the original array</p>

</html>
