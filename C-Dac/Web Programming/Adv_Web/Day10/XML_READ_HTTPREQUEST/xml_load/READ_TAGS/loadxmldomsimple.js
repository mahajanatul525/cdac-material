function loadXMLDoc(dname)
{   alert(dname)
try{
	  xmlDoc = new window.XMLHttpRequest();
	  alert(xmlDoc)
    xmlDoc.open("post",dname,false); //setup 
    xmlDoc.send(null);//heat the server
	alert("hi_____this gor executed")
	alert(xmlDoc.responseXML)
    xmlDoc = xmlDoc.responseXML.documentElement; //root node
	
	alert( xmlDoc)
    
	return (xmlDoc)
	  	  } 
	  catch(e){    alert(e.message)  }


} 