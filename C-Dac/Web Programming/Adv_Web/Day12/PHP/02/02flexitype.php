<?php
$foo="0";

echo gettype($foo);

var_dump($foo);


echo "<hr/>";




$foo +=2;
echo gettype($foo);

echo $foo;
var_dump($foo);

echo "<hr/>";


$foo =$foo+1.3;
echo gettype($foo);
echo $foo;
var_dump($foo);

echo "<hr/>";

$foo=5+"20 good";

echo gettype($foo) ." ".$foo;
var_dump($foo);
echo "<hr/>";

$foo=6+ "good 5";

echo gettype($foo) ." ".$foo;
var_dump($foo);


?>