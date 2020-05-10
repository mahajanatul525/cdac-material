<?php

$str = "<b><i><u>Is your name O'reilly it is good</u></i></b>?";
echo $str;

echo "<hr/>";

echo strip_tags($str);
echo "<hr/>";

echo strip_tags($str,"<b><u>");
?>
<p>strip_tags — Strip HTML and PHP tags from a string'</p>

<p>string strip_tags ( string $str [, string $allowable_tags ] )</p>
<p>
Return Values
Returns the stripped string. 


</p>

