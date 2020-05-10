$(document).ready(function(){
	
  $("#btn").click(function(){
//var n=$("#nm").val();
//var p= $("#pas").val();

arr=$("#frm").serializeJSON();

//var arr = {"nm" : n, "pass" : p};
var url="insert_retjson.php";
console.log(arr);
alert(url)
       $.post(url,{data:arr},function(d) {
		              alert(d);
					  var y= $.parseJSON(d);
					   alert(y.k);
                     if(y.k==false)
					 $('#dd').html("result="+y.k);
					  
					   else 
					   {					   
						   $('#dd').html("result="+y.k);
						   }
					   
					   
					  
                }).fail(function(x) {
    alert( "error"+x );
  })

});
});
