function loadXMLDoc(dname)
{   alert(dname)
try{
	  xmlDoc = new XMLHttpRequest();
    xmlDoc.open("post",dname,false);
    xmlDoc.send(null);
    xmlDoc = xmlDoc.responseXML;
	
	alert( xmlDoc)
   
	return (xmlDoc)
	  	  } 
		  catch(e){    alert(e.message)  }




} 