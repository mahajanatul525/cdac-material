<html>
<body>
Welcome <?php echo $_REQUEST["name"]; ?>.<br />
You are <?php echo $_REQUEST["age"]; ?> years old.


<?PHP
echo "<br/>";

foreach($_REQUEST as $val)
{
echo $val;

}

echo "<br/>";
print_r($_REQUEST);

?>
</body>
</html>
