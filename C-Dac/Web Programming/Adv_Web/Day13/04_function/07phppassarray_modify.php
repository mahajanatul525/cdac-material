<html>  <head>    <title>
      Passing arrays to functions
    </title>  </head>  <body>
    <h1>      Passing arrays to functions    </h1>
    <?php
 $scores = array(65, 32, 78, 98, 66);
echo "<hr/>";
     averager($scores);
echo "<hr/>";
echo "observe original array";
print_r($scores);
echo "<hr/>";
     function averager($array)
      {echo count($array);
     echo "<hr/>";
        for($i=0;$i<count($array);$i++)
    	{
        	$array[$i]=$array[$i]+1;
		echo  "out=".$array[$i];
    	}
 echo "<hr/>";
        print_r($array);
      }
    ?>
  </body>
</html>
