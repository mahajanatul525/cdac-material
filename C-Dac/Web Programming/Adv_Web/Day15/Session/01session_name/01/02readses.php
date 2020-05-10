<?php
session_start();

echo $_SESSION['greet'];
echo session_name();
echo session_id();

?>