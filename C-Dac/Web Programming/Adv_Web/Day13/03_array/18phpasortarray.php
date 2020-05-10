<html>
<?php
  $ice_cream["good"] = "orange";
  $ice_cream["better"] = "vanilla";
  $ice_cream["best"] = "rum raisin";

  print_r($ice_cream);
    
  asort($ice_cream);

  print_r($ice_cream);
  
  echo "<hr/>";
  $ice["good"] = "orange";
  $ice["better"] = "vanilla";
  $ice["best"] = "rum raisin";
  
  sort($ice);
  echo $ice['good'];
  echo "<hr/>";
  print_r($ice);
?>
<p> It is associative array to sort  use asort</p>
<p>if you use sort  function to associative array(ie. with key) it will remove key</p>

</html>
