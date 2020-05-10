<html>
<?php
    $ice_cream[0] = "orange";
    $ice_cream[1] = "vanilla";
    $ice_cream[2] = "rum raisin";

    print_r($ice_cream);
    echo "<hr/>";
    rsort($ice_cream);

    print_r($ice_cream);
?>
<p> it will modify the original array</p>

</html>
