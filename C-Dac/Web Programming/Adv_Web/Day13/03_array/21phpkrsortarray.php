<html>
<?php
  $ice_cream["A"] = "orange";
  $ice_cream["Z"] = "vanilla";
  $ice_cream["B"] = "rum raisin";

  print_r($ice_cream);
    
  Krsort($ice_cream);

  print_r($ice_cream);
?>
<p> It is associative array to reverse sort this use krsort</p>

</html>
