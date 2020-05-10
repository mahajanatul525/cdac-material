<html><head>
 <style>
  .red{color:red}
  .blue{color:blue}
  </style>
  </head>
     <body> 
    <?php
	$r=$_REQUEST["ra"];
      if(isset($_REQUEST["ra"])) 
	  { 
		if($r=="red")
		{
		echo "<h1 class='red'>welcome user</h1>";
		}
		else
		{
        echo "<h1 class='blue'>welcome user</h1>";
		}
	  }
		else{
			echo "ghari ja";
		}
    ?>
  </body>
</html>
