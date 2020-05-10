<html>
<?php
    $ice_cream[0] = "Orange";
    $ice_cream[1] = "manilla";
    $ice_cream[2] = "Manilla";
    $ice_cream[3] = "oum oasin";

    print_r($ice_cream);
    echo "<hr/>";
    natcasesort($ice_cream);

    print_r($ice_cream);
?>
<p> it will modify the original array case in sensitive</p>
This function implements a sort algorithm that
 orders alphanumeric strings in the way a human 
 being would while maintaining key/value associations.
 This is described as a "natural ordering". 
</html>
