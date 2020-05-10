<?php

$a_bool = TRUE;   // a boolean
$a_str  = "foo";  // a string
$a_str2 = 'foo';  // a string
$an_int = 12;     // an integer
$f=2.5;


echo gettype($a_bool); // prints out:  boolean

echo "<hr/>";

var_dump($a_bool); //printsout bool(true)

var_dump($a_str);
echo "<hr/>";

echo gettype($a_str);  // prints out:  string

echo "<hr/>";

echo gettype($f);	//double


echo "<hr/>";
// If this is an integer, increment it by four
if (is_int($an_int)) {
    $an_int += 4;
echo $an_int;		//16
}
echo "<hr/>";
// If $bool is a string, print it out
// (does not print out anything)

if (is_string($a_bool)) {

    echo "String: $a_bool";
}
else
{

echo "not a string";
}
echo "<hr/>";

if (is_float($f)) {
   $f= $f+2.5;
echo $f;    //5

}
echo "<hr/>";

var_dump($f);


?> 
