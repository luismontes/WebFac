<%-- 
    Document   : index
    Created on : 28/02/2014, 03:10:59 PM
    Author     : 01 - Luis Montes
--%>

<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.BufferedReader"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.StringWriter"%>
<%@page import="java.io.StringReader"%>
<%@page import="javax.xml.transform.TransformerFactory"%>
<%@page import="javax.xml.transform.Transformer"%>

  <!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WebFac</title>
    </head>
    <body>

    <%-- start web service invocation --%><hr/>
    <%
    try {
     
       
        java.lang.String ruta = "C:/Users/01/Documents/NetBeansProjects/WebFac/web/facturas/FM00000000000000000418.xml";
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(new FileInputStream(ruta)));
        java.lang.StringBuilder sbData = new java.lang.StringBuilder();
        // Lectura del fichero
        java.lang.String linea;
        while ((linea = bufferReader.readLine()) != null) {
            sbData.append(linea);
        }
        
        java.lang.String usuari = ("");
	java.lang.String passwor = ("");
        java.lang.String usuario = usuari.trim();
	java.lang.String password = passwor.trim();
	java.lang.String xmlCFD = (sbData.toString());
	com.ekomercio.edixcfdisecure.WSCFDBuilderPlus service = new com.ekomercio.edixcfdisecure.WSCFDBuilderPlus();
	com.ekomercio.edixcfdisecure.WSCFDBuilderPlusSoap port = service.getWSCFDBuilderPlusSoap();
	// TODO process result here
	java.lang.String result = port.getCFDIFromCFD(usuario, password, xmlCFD);
        port.getCFDIFromCFD(usuario, password, xmlCFD);
        //out.println(getCFDIFromCFD);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    
    
    </body>
</html>
