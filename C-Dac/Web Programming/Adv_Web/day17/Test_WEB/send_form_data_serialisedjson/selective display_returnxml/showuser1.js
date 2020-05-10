$(document).ready(function(){
  $("#sl").change(function(){
arr=$("#sl").serializeJSON();
var url="displaybytag.php";
console.log(arr);
alert(url)
       $.post(url,{data:arr},function(d) {
		              alert(d);
					  						 
document.getElementById("firstname").innerHTML=d.getElementsByTagName("firstname")[0].childNodes[0].nodeValue;
document.getElementById("lastname").innerHTML=d.getElementsByTagName("lastname")[0].childNodes[0].nodeValue;
 
document.getElementById("age").innerHTML=d.getElementsByTagName("id")[0].childNodes[0].nodeValue;
  
					                 }).fail(function(x) {
    alert( "error"+x );
  })

});
});
