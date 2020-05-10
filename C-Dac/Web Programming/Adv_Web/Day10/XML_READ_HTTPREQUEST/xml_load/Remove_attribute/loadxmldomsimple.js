function loadXMLDoc(dname)
{   alert("go")
try{
	  xmlDoc = new window.XMLHttpRequest();
    xmlDoc.open("post",dname,false);
    xmlDoc.send(null);
    xmlDoc = xmlDoc.responseXML.documentElement;
	alert( xmlDoc)
    return (xmlDoc)
	  	  } 
		  catch(e){    alert(e.message)  }

} 