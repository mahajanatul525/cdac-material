<?php

$arr[0]="vidya";
$arr[1]="nidhi";
$arr[2]="Infotech";
$arr[3]="Mumbai";

if(in_array("vidya",$arr))
{


echo " found ";
}


echo "<br/>";
$a=array();
if(in_array("v",$a))
echo ("data");
else
echo ("no data");



echo "<br/>";
echo "<hr/>";
$a = array('1.10', 12.4, 1.13);

if (in_array(12.4, $a, true)) 
    echo "'12.4' found with strict check\n";
else
echo "check data type";


echo "<hr/>";
if (in_array(1.13, $a, true)) {
    echo "1.13 found with strict check\n";
}


?>
<p>in_array — Checks if a value exists in an array</p>
<p>bool in_array ( mixed $needle , array $haystack [, bool $strict ] )</P>
<pre>needle 
The searched value. 

Note: If needle is a string, the comparison is done in a case-sensitive manner. 


haystack 
The array. 

strict 
If the third parameter strict is set to TRUE then the in_array() function will also check the types of the needle in the haystack . 


Return Values
Returns TRUE if needle is found in the array, FALSE otherwise. 
</pre>

