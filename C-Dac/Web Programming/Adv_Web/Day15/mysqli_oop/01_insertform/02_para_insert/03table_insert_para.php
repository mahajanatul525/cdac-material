<?php

$servername = "localhost";
$username = "root";
$password = "";
$dbname = "myDB";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

$f=$_REQUEST['firstname'];
$l=$_REQUEST['lastname'];
$e=$_REQUEST['email'];

// prepare and bind
$stmt = $conn->prepare("INSERT INTO MyGuests (firstname, lastname, email) VALUES (?, ?, ?)");

/*The "sss" argument lists the types of data that the parameters are.
 The s character tells mysql that the parameter is a string.

The argument may be one of four types:

i - integer
d - double
s - string
b - BLOB*/

$stmt->bind_param("sss", $firstname, $lastname, $email);

// set parameters and execute
$firstname = $f;
$lastname = $l;
$email = $e;
$stmt->execute();

echo "New records created successfully";

$stmt->close();
$conn->close();
?>