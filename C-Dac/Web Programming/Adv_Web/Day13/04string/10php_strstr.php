<html>

<body>

<?PHP

$email  = 'name@exa@mple.com';
$domain = strstr($email, '@');
echo $domain; // prints @example.com
echo "<hr/>";

$user = strstr($email, '@', true); // As of PHP 5.3.0
echo $user; // prints name
?>
<pre>
strstr — Find first occurrence of a string

Description
string strstr ( string $haystack , mixed $needle [, bool $before_needle= false ] )
Returns part of haystack string from the first occurrence of needle to the end of haystack . 

Note: This function is case-sensitive. For case-insensitive searches, use stristr(). 



Parameters

haystack 
The input string. 

needle 
If needle is not a string, it is converted to an integer and applied as the ordinal value of a character. 

before_needle 
If TRUE (the default is FALSE), strstr() returns the part of the haystack before the first occurrence of the needle . 


Return Values
Returns the portion of string, or FALSE if needle is not found. 

</pre>
</body>
</html>
