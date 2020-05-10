<html><body">
Welcome <?php echo $_POST["name"]; ?>.<br />
You are <?php echo $_POST["age"]; ?> years old.

<?PHP
echo "<br/>";
foreach($_POST as $val)
{echo $val; }
echo "<br/>";
print_r($_POST);

?>
</body>
</html>
